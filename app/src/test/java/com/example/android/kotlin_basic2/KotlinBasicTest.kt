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

open class Person {
    open fun doAction(){
        println("person")
    }
}
class Man : Person() {
    override fun doAction(){
        println("Man")
    }

    fun jiaoji() {
        println("jiaoji")
    }
}

fun Person.fuck() {
    println("Person fuck ")
}

/**
 * 扩展函数是没有动态运行期的哈
 */
fun Man.fuck() {
    println("Man fuck")
}



fun whenTest(type: Int) {
    when (type) {
        TYPE_1 -> println("type 1")
        TYPE_2 -> println("type 2")
        else -> println("other")
    }
}

class KotlinBasicTest {
    // 只有在class中才有多个@Test入口
    @Test
    fun testAS() {
        val man = Man()
        val person = Person()
//        man.doAction()
        xxxx(person)
        xxxx(man)
    }

    @Test
    fun testAS2() {
        val person = Man()
        isTest(person)
    }

    fun isTest(person: Person) {
        if (person is Man) {
            println("是男人")
            (person as Man).jiaoji()
        } else {
            println("不是男人")
        }
    }

    fun xxxx(person: Person) {
        person.doAction()
        person.fuck()
    }

    @Test
    fun testWhen() {
        whenTest(5)
    }
}