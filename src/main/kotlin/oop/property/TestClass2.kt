package oop.property

class TestClass2 {
    var v1:Int = 0
    val v2:Int = 0
    var v3:Int = 100
        //get() = field
        get(){
            println("get 호출")
            return field
        }
        set(value) {
            println("set 호출")
            field = value
        }
}