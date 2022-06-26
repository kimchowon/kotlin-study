package study_1.study_1_2

/**
 * 1-2.null을 다루는 방법
 * - Safe Call과 Elvis 연산자
 */
class Test02 {

}

fun main(args: Array<String>) {
    /**
     * Safe Call
     * - null이 아니면 실행하고 null이면 실행하지 않는다.
     * - null이면 그냥 null을 반환
     */
    var str: String? = "ABC"
    println(str?.length)

    /**
     * Elvis 연산자
     * - 앞의 연산 결과가 null이면 뒤의 값을 사용
     */
    str = null
    println(str?.length ?: 0)
}


/**
 * null이 들어갈 수 없는 결과값이 반환
 */
fun startWithB(str: String?): Boolean {
    return str?.startsWith("B") ?: throw IllegalArgumentException("null이 들어있습니다.")
}

/**
 * null이 들어갈 수 있는 결과값이 반환
 */
fun startWithB2(str: String?): Boolean? {
    return str?.startsWith("B")
}

/**
 * null이 들어갈 수 없는 결과값이 반환
 */
fun startWithB3(str: String?): Boolean {
    return str?.startsWith("B") ?: false;
}