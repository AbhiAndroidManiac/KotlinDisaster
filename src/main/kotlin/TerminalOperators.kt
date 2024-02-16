import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.reduce

object TerminalOperators {
    suspend fun runFlow(){
            //Terminal operator are the operators that actually start the flow
            //by connecting the flow builder , operators to the collector
            //collect is the basic Terminal operator
            //You must write the terminal operator to start a flow
            /*(1..5).asFlow()
                .filter { it%2==0 }
                .map { it*it }
                .collect{
                    println(it.toString())
                }*/

            //another terminal operator which runs a flow is reduce
            val result = (1..5).asFlow().reduce{a,b->a+b}
            println(result)
    }

}