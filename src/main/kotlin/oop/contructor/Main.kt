package oop

import oop.contructor.TestClass1
import oop.contructor.TestClass2
import oop.contructor.TestClass3

fun main(){
    val obj = TestClass1()
    val obj2 = TestClass2()
    var obj3 = TestClass2(1,2)
    println("obj.v1 : ${obj3.v1}")
    println("obj.v1 : ${obj3.v2}")


}