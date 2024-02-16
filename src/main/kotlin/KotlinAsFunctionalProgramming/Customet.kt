package KotlinAsFunctionalProgramming

class Customet
/*Unit*/
//if you don't specify any return type for a function that it automatically specifies
//that its return type is Unit
//
/*Nothing*/
//if you specify a function to return nothing then it returns nothing as
// the function which returns nothing is TODO:-/*//TODO("Implement this")*/
fun printMessage(value :String):Unit{

    println("$value")
}

//single expression function
fun sum(x:Int,y:Int) = x+y

fun main(args: Array<String>) {
    val result = printMessage("something printing")
    println(result)
}
