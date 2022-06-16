package oop.abstact

fun main(){
    val obj1 = Super1()
    testFun1(obj1)

    val obj2 = SubClass1()
    testFun1(obj2)
}

fun testFun1(obj1:Super1){
    obj1.method1()
    obj1.method2()
}