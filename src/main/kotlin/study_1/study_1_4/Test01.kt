package study_1.study_1_4

import study_1_4.JavaMoney

/**
 * 1_4.연산자를 다루는 방법
 */
class Test01 {
}

fun main(args: Array<String>) {

    val money1 = JavaMoney(2000L)
    val money2 = JavaMoney(1000L)

    if (money1 > money2) { // JavaMoney 클래스의 compareTo 메서드 자동 호출
        println("money1이 money2보다 큽니다.")
    }
    println()

    /*
     * 동등성 vs 동일성
     * 동등성: 값이 같은 객체
     * 동일성: 완전히 동일한 객체, 즉 주소가 같은 객체
     *
     * <Java>
     * - 동등성: equals 메소드
     * - 동일성: ==
     *
     * <kotlin>
     * - 동등성: == (간접적으로 equals 호출)
     * - 동일성: ===
     *
     */

    val money3 = JavaMoney(2000L)
    val money4 = money3
    val money5 = JavaMoney(2000L)

    // 값 비교(동등성)
    println(money3 == money4)
    println(money3 == money5)
    println()

    // 주소 비교(동일성)
    println(money3 === money4)
    print(money3 === money5)
}