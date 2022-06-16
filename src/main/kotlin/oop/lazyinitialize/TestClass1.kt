package oop.lazyinitialize

class TestClass1 {
    var a1 = 100
    var a2:Int
    lateinit var a3:String
    val a4:String by lazy {
        println("a4 init")
        "문지열2"
    }

    init {
        a2 = 200
    }

    fun testMethod(){
        if(::a3.isInitialized == false){ // <- 변수가 초기화되었는지 확인 하는 것
            a3 = "문자열"

            // :: -> 리플랙션 객체의 클래스 정보를 이용할수 있음
        }
    }
}