package study_2.study_2_2

/**
 * 02.kotlin에서 코드를 제어하는 방법
 * 02_2.kotlin에서 반복문을 다루는 방법
 * - for, for-each, while 문
 * - Progression과 Range
 */
class Test01 {
}

fun main(args: Array<String>) {

    // 1.for-each문
    val numbers = listOf(1L, 2L, 3L);
    for (number in numbers) {
        println(number)
    }

    // 2.for문 오름차순
    for (i in 1..3) {
        println(i)
    }

    // 3.for문 내림차순
    for (i in 3 downTo 1) {
        println(i)
    }

    // 4.for문 2씩 증가
    for (i in 1..5 step 2) {
        println(i)
    }

    // 5.while문
    var i = 0
    while (i <= 3) {
        println(i)
        i++;
    }
}