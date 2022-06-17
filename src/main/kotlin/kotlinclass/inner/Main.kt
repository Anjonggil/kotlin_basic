package kotlinclass.inner

fun main(){
    val obj1 = Outer1()
    obj1.outerMethod1()

    val obj2 = obj1.Inner1()
    obj2.innerMethod1()
    obj2.innerMethod2()
}