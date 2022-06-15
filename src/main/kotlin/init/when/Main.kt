package init.`when`

fun main(){
    val a1 = 2

    when(a1){
        1 -> println("a1은 1입니다.")
        2 -> {
            println("여기가 될 꺼임")
            println("a1은 2입니다.")
        }
        else -> {
            println("a1dms dkslqslek.")
        }
    }

    val a2 = 2

    when(a2){
        1,2 -> println("a2는 1이거나 2입니다.")
        3,4 -> println("a2는 3이거나 4입니다.")
        5,6 -> println("a2는 5이거나 6입니다.")
        else -> println("a2는 1,2,3,4,5,6이 아닙니다.")
    }

    val a3 = 5

    when(a3){
        in 1..3 -> println("a3는 1 ~ 3사이의 숫자입니다.")
        in 4..6 -> println("a3는 4 ~ 6사이의 숫자입니다.")
    }

    val str1 = setValue(1);
    val str2 = setValue(2);
    val str3 = setValue(3);

}

fun setValue(a1 : Int) = when(a1){
    1 -> "문자열1"
    2 -> "문자열2"
    else -> "그 외의 문자열"
}