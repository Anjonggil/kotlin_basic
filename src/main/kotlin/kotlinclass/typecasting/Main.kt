package kotlinclass.typecasting

fun main(){
    val obj1:SubClass1 = SubClass1()
    val obj2:SubClass2 = SubClass2()

    val super1:SuperClass1 = obj1
    val inter1:Inter1 = obj2

    println("------------------------------")

    super1 as SubClass1 // kotlin cast
    inter1 as SubClass2

//    inter1 as SubClass1 // 이 경우 관련이 없기 때문에 불가능

    super1.subMethod1()
    inter1.subMethod1()

    println("------------------------------")

    val obj3 = SubClass1()

    val chk1 = obj3 is SuperClass1
    println("chk1 = ${chk1}")

    val super3:SuperClass1 = obj3
    val chk3 = super3 is SubClass1
    println("chk3 = ${chk3}")

    if (super3 is SubClass1){
        //is 연산자 값이 true 라면 형변환이 가능한 상황이므로 스마트 캐스팅 발생
        super3.subMethod1()
    }
}

open class SuperClass1
interface Inter1

class SubClass1 : SuperClass1(){
    fun subMethod1(){
        println("SubClass1의 subMethod1입니다.")
    }
}
class SubClass2 : Inter1{
    fun subMethod1(){
        println("SubClass2의 subMethod1입니다.")
    }
}
