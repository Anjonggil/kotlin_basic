package kotlinclass.companion

import oop.access.TestClass

fun main(){
    val obj = TestClass1()
    obj.testFun1()

    val obj2 = TestClass1()
    obj2.testFun1()


    TestClass1.testFun2()
}