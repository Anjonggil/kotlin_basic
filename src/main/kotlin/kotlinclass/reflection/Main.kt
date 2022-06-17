package kotlinclass.reflection

import kotlin.reflect.KClass

fun main(){
    val a1: KClass<String> = String::class
    val a2: Class<String> = String::class.java

    println(a1)
    println(a2)

    val str1:String = "안녕하세요"
    val a3:KClass<out String> = str1::class
    val a4:Class<out String> = str1::class.java
    println(a3)
    println(a4)
}