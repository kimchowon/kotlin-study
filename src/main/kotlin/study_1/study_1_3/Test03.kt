package study_1.study_1_3

import java.lang.IllegalArgumentException

/**
 * 1_3.type을 다루는 방법
 * - kotlin에만 존재하는 타입 3가지
 * - Any, Anit, Nothing
 */
class Test03 {
}

fun main(args: Array<String>) {
    // Any: Java의 Object 타입과 같은 클래스

    // Unit: Java의 void와 동일한 키워드

    // Nothing: 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
    // 무조건 예외를 반환하는 함수, 무한루프 함수 등
}

/**
 * Nothing 키워드 예시
 */
fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}
