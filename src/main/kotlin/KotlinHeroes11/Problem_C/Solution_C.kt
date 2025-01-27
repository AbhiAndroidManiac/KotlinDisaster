package KotlinHeroes11.Problem_C

import java.io.File
import kotlin.math.max

class Solution_C {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            repeat(readInt()){
                val s = readln()
                val a = s.split("+")
                val n = a.size
                var sum = a[0].toLong()+a[n-1].toLong()
                for (i in 0..n-2){
                    val t = a[i]
                    var max = 0L
                    for (j in 0..t.length-1){
                        max = maxOf(max,t.substring(0,j).toLong()+t.substring(j).toLong())
                    }
                    sum+=max
                }
                println(sum)
            }
        }
        private fun readInt() = readln().toInt()
        private fun readLong() = readln().toLong()
        private fun readDouble() = readln().toDouble()
        private fun readStrings() = readln().split(" ")
        private fun readInts() = readStrings().map { it.toInt() }
        private fun readLongs() = readStrings().map { it.toLong() }
        private fun readDoubles() = readStrings().map { it.toDouble() }
    }
}