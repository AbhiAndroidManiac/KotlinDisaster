package KotlinHeroes11.Problem_A



class Solution_A {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            /** iterating through the number of test cases  **/
            repeat(readInt()){
                //number of questions in the problem
                val n = readInt()
                // difficulty of the problem
                val a = readInts()
                val x = a.dropLast(1).max()
                //if maximum difficulty value is at the
                if (a[n-1] == x+1){
                    println(x)
                } else {
                    println("Ambiguous")
                }
            }
        }
        private fun readInt() = readln().toInt()
        private fun readLong() = readln().toLong()
        private fun readDouble() = readln().toDouble()
        private fun readStrings() = readln().split(" ")
        private fun readInts() = readStrings().map {it.toInt()}
        private fun readLongs() = readStrings().map{it.toLong()}
        private fun readDoubles() = readStrings().map {it.toDouble()}

    }

}