package kotlinclass.dataclass

fun main(){
    val obj = TestClass1(100,200,300)
    val obj2 = TestClass1(100,200)

    obj.a1 = 100

    val copy = obj.copy()
    println(copy)

    //데이터 클래스는 반드시 주 생성자에 모두 적어내어야함

}