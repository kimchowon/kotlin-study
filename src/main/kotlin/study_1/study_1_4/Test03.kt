package study_1.study_1_4

/**
 * 연산자 오버로딩
 * - 코틀린에서는 객체마다 연산자를 직접 정의할 수 있다.
 */
class Test03 {
}

fun main(args: Array<String>) {
    val money1 = Money(1000L)
    val money2 = Money(2000L)

    println(money1 + money2)
}