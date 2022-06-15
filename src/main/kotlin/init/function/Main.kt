package function

fun main(){
    test1();
    test2(100, 11.11)
    val k1:Int = 100
    val k2:Double = 11.11
    test2(k1,k2)
    test2(a2 = 66.66, a1 = 100)

    test2(a1 = 30)
    val test3 = test3(100, 200)
    println(test3)
    test4()
}

fun test1(){
    println("test1 함수 호출")
}

fun test2(a1:Int = 0, a2:Double = 0.0){
    println("test2 호출")
    println("a1 : $a1")
    println("a2 : $a2")
    println("---------------------")
    //기본 값이 있는 값일때만 생략이 가능
}

fun test3(a1: Int, a2: Int): Int {
    println("test3 함수 호출")
    println("--------------------")
    return a1 + a2
}

fun test4() {
    println("test4 호출")
    println("--------------------")
}

