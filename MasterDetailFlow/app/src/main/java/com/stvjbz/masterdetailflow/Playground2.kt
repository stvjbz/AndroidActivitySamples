package com.stvjbz.masterdetailflow

import android.util.Pair

/**
 * Created by stvjbz on 16/05/30.
 */
class Playground2 {
    fun main(args: Array<String>) {
        var m = mutableMapOf(Pair(1, "a"))
        m.put(2, "b")
        //m.


        val presidents = arrayOf(Pair("John F", "K"), Pair("Ronald", "Reagan"))

        presidents.forEach { println("${it.first} ${it.second}") }

        val numbers = arrayOf(1, 2, 3, 4, 5)

        numbers.forEach { println(it) }

        //specialized primitives arrays for performance
        val bools = booleanArrayOf(true, false, true)
        val bytes = byteArrayOf(1, 2)
        val ints = intArrayOf(1, 2, 3)
        val floats = floatArrayOf(1.0f, 2.0f, 3.0f)
        val doubles = doubleArrayOf(1.0, 2.0, 3.0)
        val longs = longArrayOf(1, 2, 3)
        val chars = charArrayOf('1', '2', '3')
        val shorts = shortArrayOf(1, 2, 3)

        val list = arrayListOf(1, 2, 3)
        list.forEach { println(it) }

        val list2 = arrayListOf(Pair("Bill", "Clinton"),
                Pair("George W.", "Bush"),
                Pair ("Barack", "Obama"))

        list2.add(Pair("Hillary", "Clinton"))

        list2.forEach { println("${it.first} - ${it.second}") }

        val dict = hashMapOf (
                "adam" to "Illionis",
                "bryan" to "Alabama",
                "cain" to "Oklahoma"
        )

        println("Current location ${dict["adam"]}")

        //this is called multi declaration where you assign the each pair key and value to separate variables
        for ((k, v) in dict)
            println("Key in $k has value $v")

        for (k in dict.keys)
            println("Key in '$k' with value '${dict[k]}'")

        println("Looping using entrySet")

        for (n in dict.entries)
            println("Key ${n.key} with value ${n.value}")

        var mm: Map<Int, String> = mutableMapOf(Pair(1, "a"))
        //mm.
    }
}