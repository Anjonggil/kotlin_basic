package oop.inherit

fun main(){

    // 부모클래스의 상속자를 반드시 받아야함!!
    val s1 = SubClass1()
    println("s1.subMember1 : ${s1.subMember1}")
    s1.subMember1()

    println("s1.superMember1 : ${s1.superMember1}")
    s1.superMember1()
}