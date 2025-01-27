package KotlinHeroes11.Problem_B

class Solution_B {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            repeat(readInt()){
                val n = readInt()
                print(1)
                for (i in n downTo 2){
                    print(" $i")
                }
                println()
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