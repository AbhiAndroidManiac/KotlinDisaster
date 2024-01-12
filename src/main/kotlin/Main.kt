import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.reduce
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
   runBlocking {
       launch {
           runFlow()
       }
   }
}
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
