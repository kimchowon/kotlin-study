package study_1.study_1_4

/**
 * 논리 연산자
 * - Java와 완전 동일!
 * &&
 * ||
 * !
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