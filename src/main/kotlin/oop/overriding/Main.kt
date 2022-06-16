package oop.overriding

fun main(){
    val obj1 = SubClass1()
    println("obj1.subA1 = ${obj1.subA1}")
    obj1.subMethod1()

    println("obj1.superA1 = ${obj1.superA1}")
    obj1.superMethod1()

    println("----------------------------------")

    val obj2:SubClass1 = obj1

    println("obj1.superA1 = ${obj1.superA1}")
    obj2.superMethod1()

    println("----------------------------------")

    val obj3 = SubClass2()
    obj3.superMethod2()

    println("----------------------------------")

    val obj4:SuperClass2 = obj3
    obj4.superMethod2()

    println("----------------------------------")

    //Overriding의 효과
    /*
    * 만약 객체가 부모형 참조 변수에 담겨 있다면 부모 영역에 정의한 맴버만 사용할 수 있다.
    * 만약 부모 메서드를 작식에서 Overriding을 했다면 부모형 참조 변수를 통해 자식의 메서드를 호출할 수 있다.
    * 이는 이벤트 처리 방식에서 사건이 발생했을 경우 개발자가 만든 메서드를 호출하기 위해 사용하는 매우 중요한 개념
    * */
}