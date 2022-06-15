package variable

fun main(){
    //정수 리터럴
    println(100)
    println(1000000000000000)
    println(938_123_435_821)

    //실수 리터럴
    println(11.11)
    println(22.22F)

    //문자 리터럴
    println('A')
    println('가')

    //문자열 리터럴
    println("문자열")

    // 논리 리터럴
    println(true)
    println(false)

    //Raw String
    println("""동해물과 백구산이 
        |마르고 닳도록 
        |하느님이 보우하사 
        |우리나라 만세""".trimMargin())

    /*
    * Kotlin 변수 선언
    *
    * var VS val
    *
    * var 변수
    * 선언 이후 값을 다시 저장할 수 있다.
    *
    * val 변수
    * 선언 이후 값을 다시 저장할 수 없다.
    *
    * 선언 방법
    *
    * var/val 변수명:타입 = 값
    * */

    val a1:Int = 100
    println("a1 : $a1")

    // 수 선언시 자료형을 생략하면 저장하는 값에 따라 자동으로 생성 한다.
    val a2 = 100
    println("a2 : $a2")

    var a3:Int = 100
    val a4:Int = 100

    a3 = 1000
    println("a3 : $a3")
    println("a4 : $a4")
//    val 변수는 선언시 update 불가
//    a4 = 1000

    /*
    * null 허용 변수
    *
    * var 변수명:타입? = 값 -> null 가능
    * var 변수명:타입 = 값 -> null 불가능
    * */

    var a5:Int = 100
    var a6:Int? = null
    println("a5 : $a5")
    println("a6 : $a6")

    var a7:Int? = a5
    println("a7 : $a7")

//    var a8:Int = a6!!
}
