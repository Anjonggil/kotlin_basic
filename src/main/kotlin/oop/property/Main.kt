package oop.property

import oop.access.TestClass

fun main(){
    val obj1 = TestClass1(100,200)
    println("obj1.a1 = ${obj1.a1}")
    println("obj1.a2 = ${obj1.a2}")

    obj1.a1 = 1000
    println("obj1.a1 = ${obj1.a1}") // 필드의 직접접근으로 보이지만 getter와 setter가 자동으로 사용된다.

    val obj2 = TestClass2()

    obj2.v1 = 100
    obj2.v3 = 2000
    println("obj2 = ${obj2.v3}")

}