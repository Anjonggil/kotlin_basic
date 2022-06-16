package oop.lazyinitialize

fun main(){
    val obj1 = TestClass1()
    println("obj1.a1 = ${obj1.a1}")
    println("obj1.a2 = ${obj1.a2}")
    obj1.testMethod()
    println("obj1.a3 = ${obj1.a3}") // 사용되기전에 반드시 값이 세팅되어야 함
    println("obj1.a4 = ${obj1.a4}")

    /*
    * 프로퍼티의 값을 나중에 셋팅할 때 지연 초기화를 사용한다.
    * var 변수는 lateinit을 사용한다.
    * val 변수는 lazy 코드 블록을 사용한다.
    * */
}