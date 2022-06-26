package study_1.study_1_2

/**
 * 1-2.null을 다루는 방법
 * - Java 코드를 Kotlin으로 변환
 */
class Test01 {

}

/**
 * null이 들어갈 수 없는 결과값이 반환
 */
fun startWithA1(str: String?): Boolean {

    if (str == null) {
        throw IllegalArgumentException("null이 들어있습니다.")
    }
    return str.startsWith("A")
}

/**
 * null이 들어갈 수 있는 결과값이 반환
 */
fun startWithA2(str: String?): Boolean? {

    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

/**
 * null이 들어갈 수 없는 결과값이 반환
 */
fun startWithA3(str: String?): Boolean {

    if (str == null) {
        return false
    }
    return str.startsWith("A")
}