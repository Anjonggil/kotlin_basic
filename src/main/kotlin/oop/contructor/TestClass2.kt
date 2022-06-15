package oop.contructor

class TestClass2 {
    var v1:Int = 0
    var v2:Int = 0

    constructor(){
        println("매개변수가 없는 생성자")
   }

    constructor(a1:Int, a2:Int){
        println("매개변수가 두개있는 생성자")
        v1 = a1
        v2 = a2
    }
}