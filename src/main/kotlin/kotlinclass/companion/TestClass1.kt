package kotlinclass.companion

class TestClass1 {
    val a1 = 100

    companion object{
        var var2 = 10000
        @JvmStatic var a3 = 2000

        fun testFun2(){
            println("testFun2")
        }

        @JvmStatic fun testFun3(){

        }
    }

    fun testFun1(){
        println("testFun1")
    }
}