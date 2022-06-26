package study_1.study_1_1

/**
 * 1-1.변수를 다루는 방법
 */
class Test01 {

}

fun main(args: Array<String>) {
    print("Hello Kotlin!")

    /**
     * var(variable)
     * 값이 변할 수 있는 변수
     * Java 의 long number1 = 10L와 동일
     */
    var number1 = 10L

    /**
     * val(value)
     * 불변 변수
     * Java 의 final long number2 = 10와 동일
     */
    val number2 = 10L

    /**
     * 타입을 명시적으로 지정
     * Kotlin 의 df는 타입 추론
     * 코드에서는 Java의 Wrapper 타입으로 명시했지만 연산 시 필요할 때 Primitive Type 으로 변환된다.
     */
    var number3: Long = 10L

    /**
     * nullable 변수
     * Kotlin 은 기본적으로 변수에 null이 들어갈 수 없게끔 설계되어 있다.
     * 변수 타입 뒤에 ?을 붙임 = 변수에 null이 들어갈 수 있다.
     */
    var number4: Long? = 1_000L
    number4 = null;

    /**
     * 객체의 인스턴스화
     * Java와 다르게 new 키워드가 없다.
     */
    var person = Person("김초원")

    /**
     * <TIP>
     * - 모든 변수는 우선 val 로 만들고 꼭 필요한 경우 var 로 변경한다.
     */

    /**
     * <정리>
     * 1.모든 변수는 var/val을 붙여주어야 한다.
     * 2.타입을 명시적으로 지정해주지 않아도 타입 추론이 가능하다. 물론 명시적으로 선언 가능
     * 3.Primitive Type과 Reference Type을 개발자가 구분해주지 않아도 된다.
     * 4.기본적으로 null이 들어갈 수 없도록 설계되어 있기 때문에 null을 허용하는 변수인지 ? 키워드로 선언해줘야 한다.
     * 5.객체의 인스턴스화를 시킬 때 new 키워드를 붙이지 않는다.
     */
}