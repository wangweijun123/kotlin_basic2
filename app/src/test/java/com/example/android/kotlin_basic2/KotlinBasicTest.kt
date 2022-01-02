package com.example.android.kotlin_basic2

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
const val TYPE_1 = 1
const val TYPE_2 = 2

class KotlinBasicTest {
    @Test
    fun addition_isCorrect() {
        println("xxxx")
    }

    @Test
    fun dddd() {
        whenTest(5)
    }

    fun whenTest(type: Int) {
        when (type) {
            TYPE_1 -> println("type 1")
            TYPE_2 -> println("type 2")
            else -> println("other")
        }
    }
}