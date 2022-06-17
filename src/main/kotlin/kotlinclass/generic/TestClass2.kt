package kotlinclass.generic

class TestClass2<T>(var a1 : T) {

    fun testMethod2(a2: T){
        println("a1 : $a1")
        println("a2 : $a2")
    }
}