package kotlinclass.inner

class Outer1 {

    var outerMember1 = 100

    fun outerMethod1(){
        println("Outer Method1")
    }

    inner class Inner1{

        val innerMember1 = 200

        fun innerMethod1(){
            println("Inner Method1")
        }

        fun innerMethod2(){
            println("outerMember1 = $outerMember1")
            outerMethod1()
        }
    }
}