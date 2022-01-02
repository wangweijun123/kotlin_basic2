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

class AA(var age: Int, var height: Int) {
    constructor(age: Int) : this(age, 100) {
        println("一个参数age的构造")
    }

    init {
        // init比constructor中 代码块先调用
        println("init ...")
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

    @Test
    fun mapOfTest() {
        // 这是不可变的map,因为没有put函数
        val mapOf: Map<Int, String> = mapOf(Pair(1, "wang"))
        // public infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
        // 中缀表达式
        val mapOf2: Map<Int, String> = mapOf(2 to "dx")
        // 中缀表达式像函数一样调用
        val mapOf3: Map<Int, String> = mapOf(3.to("ddxx"))
        // vararg可变参数
        val mapOf4: Map<Int, String> = mapOf(4 to "dx", 5 to "wxj")
        val vv = mapOf.get(1)
        println(vv)
        println(mapOf2.get(2))
        println(mapOf3.get(3))
        println(mapOf4.get(4))
        println(mapOf4.get(5))
        // 产生了一个新的数组
//        val newMap = mapOf4 + (6 to "dandan")
        val newMap = mapOf4.plus(6 to "dandan")
        println("mapOf4 === newMap ? " + (mapOf4 === newMap))
        println(newMap.get(6))

        val mutableMapOf = mutableMapOf<String, String>()
        mutableMapOf.put("wang", "dx");
        println(mutableMapOf.get("wang"))

    }
    @Test
    fun invokeTest() {
        val aa = AA(10)
        // a() == a.invoke()
        /*bibao.invoke(100)
        bibao(200)*/
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