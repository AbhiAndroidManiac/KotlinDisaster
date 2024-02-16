import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.reduce
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {


//implementation and use case of Terminal operators
/*   runBlocking {
       launch {
           TerminalOperators.runFlow()
       }
   }*/
    val list = listOf<String>("The","name","of","The","value","is","something","the")

    val result = itDoesSomething(list)
    for ((key, value) in result) {
        println("Key: $key, Value: $value")
    }
   /* val resultofsomething=itAlsoDoesSomething(list)
    for (i in 0..(resultofsomething.size-1)){
        println("Key: ${resultofsomething.get(i).first} , Value: ${resultofsomething.get(i).second}")
    }*/
}
fun itAlsoDoesSomething(elements: List<String>) : List<Pair<String,Int>>{
    return elements.groupBy {
        it
    }.map {
        Pair(it.key,it.value.count())
    }
}
//just finds the number of same elements in a list
fun itDoesSomething(elements : List<String>):HashMap<String,Int>{
    var i=0
    val results = hashMapOf<String,Int>()
    while (i<elements.size){
        val element = results[elements[i]]
        if (element!=null){
            results[elements[i]] = element +1
        } else {
            results[elements[i]] = 1
        }
        i++
    }
    return results
}


