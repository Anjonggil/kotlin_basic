package oop.access

class SubClass1 : TestClass() {
    fun subMethod1(){
//        println("private1 = ${private1}")
        println("protected1 = ${protected1}")
        println("public1 = ${public1}")
        println("internal1 = ${internal1}")
    }
}