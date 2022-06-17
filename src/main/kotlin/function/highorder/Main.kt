package function.highorder

fun main(){
    val t1 = fun(x1:Int, x2:Int) : Int {
        return x1 + x2
    }

    testFun1(100,100,t1)
}

fun testFun1(a1:Int, a2:Int, m1:(Int,Int) -> Int){
    val r1 = m1(a1,a2)
    println("r1 = ${r1}")
}
