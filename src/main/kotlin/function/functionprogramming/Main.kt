package function.functionprogramming


fun main(){
    val r1 = testFun1(100,200)
    println("r1 : $r1")

    val lambda1 : (Int,Int) -> Int = {a1:Int, a2:Int -> a1 + a2}

    val lambda2 = {a1:Int, a2:Int -> a1 + a2}

    val r4 = lambda1(100,200)
    println("r4 = ${r4}")

    val r5 = lambda2(100,200)
    println("r5 = ${r5}")

    var test:Int = testFun3(100)

}

inline fun testFun3(value:Int): Int {
    return value*5
}

fun testFun1(a1:Int, a2:Int) : Int{
    return a1 + a2
}

fun testFun2(a1: Int,a2: Int) : Int = a1 + a2
