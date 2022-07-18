package study_1.study_1_4

/**
 * 논리 연산자
 * - Java와 완전 동일!
 * &&
 * ||
 * !
 *
 *
 */

/**
 * 코클린에 있는 특이한 연산자
 * in / !in
 * - 컬렉션이나 범위 내에 포함 여부를 true/false로 반환
 *
 * a..b
 * - a부터 b까지의 범위 객체를 생성한다.
 */
class Test02 {
}

fun main(args: Array<String>) {

    if (fun1() || fun2()) {
        println("본문")
    }
}

fun fun1(): Boolean {
    println("fun1")
    return true;
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}