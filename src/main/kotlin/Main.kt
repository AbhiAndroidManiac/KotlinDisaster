import java.text.SimpleDateFormat
import java.time.LocalTime
import java.time.temporal.ChronoUnit

private fun findDiffAfterO(startTime:String,endTime:String){
    var returnPrint = -2L
    try {
        val startTimeInFormat = LocalTime.parse(startTime)
        val endTimeInFormat = LocalTime.parse(endTime)


        // Calculate the difference in minutes
        val minutesDifference = ChronoUnit.MINUTES.between( startTimeInFormat,endTimeInFormat)
        returnPrint = minutesDifference
    } catch (e:Exception){
        returnPrint = -1L
    }
    println(returnPrint)
}
private fun findDiffBeforeO(startTime:String,endTime:String){
    var result = -2L
    val dateFormat = SimpleDateFormat("HH:mm")
    try {
        val startTimeInformat = dateFormat.parse(startTime)
        val endTimeInformat = dateFormat.parse(endTime)
        val differenceInMin = (endTimeInformat.time-startTimeInformat.time)/(60*1000)
        result =  differenceInMin
    } catch (e:Exception){
        result= -1
    }
    println(result)
}
fun main(args: Array<String>) {
    val startTime = "09:45"
    val endTime = "14:30"
    findDiffAfterO(startTime,endTime)
    findDiffBeforeO(startTime,endTime)
    println("The message is getting printed")
    println(generateColorEncoded("#F75246"))
//implementation and use case of Terminal operators
    /*   runBlocking {
           launch {
               TerminalOperators.runFlow()
           }
       }*/
    /*   val list = listOf<String>("The","name","of","The","value","is","something","the")

       val result = itDoesSomething(list)
       for ((key, value) in result) {
           println("Key: $key, Value: $value")
       }*/
    /* val resultofsomething=itAlsoDoesSomething(list)
     for (i in 0..(resultofsomething.size-1)){
         println("Key: ${resultofsomething.get(i).first} , Value: ${resultofsomething.get(i).second}")
     }*/
}

private fun generateColorEncoded(string: String):String {
    try {
        if (!string.isNullOrEmpty()) {
            if (string.contains("#")) {
                val colorToGenerate = string.split("#")
                return "#80${colorToGenerate.get(1)}"
                println("${colorToGenerate.get(0)} and the rest of the code is ${colorToGenerate.get(1)}")
            } else {
                println("color doesn't have the code")
                return "#FFFFFF"
            }
        } else return "#FFFFFF"
    } catch (e:Exception){
        return "#FFFFFF"
    }

}

fun itAlsoDoesSomething(elements: List<String>): List<Pair<String, Int>> {
    return elements.groupBy {
        it
    }.map {
        Pair(it.key, it.value.count())
    }
}

//just finds the number of same elements in a list
fun itDoesSomething(elements: List<String>): HashMap<String, Int> {
    var i = 0
    val results = hashMapOf<String, Int>()
    while (i < elements.size) {
        val element = results[elements[i]]
        if (element != null) {
            results[elements[i]] = element + 1
        } else {
            results[elements[i]] = 1
        }
        i++
    }
    return results
}


