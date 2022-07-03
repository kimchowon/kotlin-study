package study_1.study_1_3

/**
 * 1_3.type을 다루는 방법
 * - 기본 타입
 */
class Test01 {
}

fun main(args: Array<String>) {
    // 타입 추론
    val num1 = 3 // int
    var num2 = 3L // long
    val num3 = 3.0f // float
    val num4 = 3.0 // double

    // 명시적 타입 변환
    // kotlin은 암시적 타입 변환이 불가능하다.
    num2 = num1.toLong()
    print(num1 + num2)

    // nullable한 변수
    // safe call과 elvis 연산자 사용
    val num5: Int? = 3
    val num6 = num5?.toLong() ?: 0L
}