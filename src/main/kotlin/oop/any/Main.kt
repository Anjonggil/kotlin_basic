package oop.any

fun main(){
    /*
    * Any 클래스
    * 코틀린에서 사용하는 모든 클래스의 부모클래스
    * 코틀린은 클래스를 작성할때 상속받지 않는다면 자동으로 any클래스를 상송받는다.
    * any클래스에는 모든객체가 가지고 있어야할 메스드가 제공되고 있으며 이 메서드들을 Overriding 하여 각 클래스의 성격에 맞게 재 구현하여 사용할 수 있다.
    * */

    val obj1 = TestClass1()
    println("obj1 = ${obj1.toString()}")
}