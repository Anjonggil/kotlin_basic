package oop.access

fun main(){
    /*
    * 동작원리
    *
    * Kotlin에서는 class에 정의한 모든 변수는 Java코드로 변경이 될 때 private가 설정된다.
    * 접근 제한자의 종류에 따라 Java 코드로 변경될 때 getter 메서드 추가 여부가 결정이 된다.
    * */

    /*
    * Class
    *
    * private : 외부에서 객체를 생성할 수 없다.
    * public : 외부에서 객체를 생성 할 수 있다. (기본)
    * protected : 클래스에 지정할 수 없다.
    * internal : 모듈 같을 경우에만 객체 생성이 가능 하다.
    * */

    /*
    * 변수, 메서드
    * 변수와 메서드는 동일하게 적용된다.
    * private : 외부에서 접근할 수 없다.
    * public : 외부에서 접근이 자유롭다.
    * protected : 상속관계일 경우에만 접근이 가능하다.
    * internal : 모듈 같을 경우에만 접근이 가능하다.
    * */

    val t1 = TestClass()
//    println("t1.private1 = ${t1.private1}")
    println("t1.public1 = ${t1.public1}")
    println("t1.internal1 = ${t1.internal1}")

}