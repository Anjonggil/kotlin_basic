package kotlinclass.nullsafe

fun main(){
    /*
    * !!
    *
    * 널 허용 변수를 널 허용하지 않는 변수로 변환
    * 변환과정에서 null 값이 들어가 있을 경우 오류가 발생한다다
    * 이 연산자의 사용은 권장하지 않음
    * */

    testFun("문자열")
//    testFun(null) // <- 오류발생
    testFun2("문자열2")
    testFun2(null)

    testFun3("문자열3")
    testFun3(null)
}

fun testFun(str:String?){
    val value1:String = str!!
    println("value1 = ${value1}")
}

fun testFun2(str:String?){

    val value:String = str ?: "문자열"
    println("value = ${value}")
}

fun testFun3(str:String?){
    println("str = ${str}")

    println("str?.length = ${str?.length}")
}