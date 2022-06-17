package kotlinclass.nullsafe2

fun main(){
    testMethod1("안녕하세요.")
    testMethod1(null)
    testMethod2("안녕하세요")
    testMethod2(null)
}

fun testMethod2(str: Any?) {
    if (str is String){
        println(str.length)
    }
}

fun testMethod1(str:String?){
    println(str?.length)

    if(str is String){
        println(str.length)
    }

    if (str != null){
        println(str.length)
    }
}