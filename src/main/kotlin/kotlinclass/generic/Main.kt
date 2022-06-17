package kotlinclass.generic



fun main(){
    val t1 = TestClass1<String>()
    t1.testMethod1("테스트 입니다.")

    val t2 = TestClass1<Int>()
    t2.testMethod1(100)

    println("------------------------")

    val t3 = TestClass2<Int>(100)
    t3.testMethod2(200)

    val t4 = TestClass2<String>("문자열1")
    t4.testMethod2("문자열2")

    println("------------------------")

    val t5 = TestClass3<String, Int>()
    t5.testMethod("문자열1", 100)

    println("------------------------")

    /*
    * 가변성
    *
    * 불변성 : 제네릭이 설정된 객체의 주소 값을 같은 타입의 제네릭 설정된 변수에만 담을 수 있다.
    * 공변성 : 제네릭이 설정된 객체의 주소 값을 부모 클래스 타입의 제네릭이 설정된 변수에도 담을 수 있다.(out)
    * 반 공변성 : 제네릭이 설정된 객체의 주소 값을 자식 클래스 타입의 제네릭이 설정된 변수에도 담을 수 있다.(in)
    * */
}