package oop.contructor

class TestClass4 (var a1:Int, val a2:Int){

    init {
        println("a1 : $a1")
        println("a2 : $a2")
    }

    constructor(a1: Int) : this(a1,100){
        println("보조 생성자 호출")
    }
}