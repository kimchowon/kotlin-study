package study_2.study_2_1

/**
 * 02.kotlin에서 코드를 제어하는 방법
 * 02-1.kotlin에서 제어문을 다루는 방법
 */
class Test01 {
    // 1.if문
    // if문은 java와 문법 똑같음
    // 다른점은 java에서 if문은 statement(문장)인데, kotlin은 expression으로 값으로 표현될 수 있다.
    // 아레 메서드 getPassOrFail 참고

    // 2.switch문
    // kotlin에서 switch문 사라짐. 대신 when 문법 사용
    // 아래 메서드 getGradeWithSwitch, getGradeWithSwitch2,
    //          startsWithA, jugdeNumber 참고

    //
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

// in 키워드와 if문 함께 사용하기
fun getPasOrFail2(score: Int): String {
    return if (score in 1..100) {
        "P"
    } else {
        "F"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch2(score: Int): String {
    return when (score / 10) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

/**
 * when 문법은 타입 체크도 가능함
 */
fun startsWithA(obj: Any): Boolean {
    return when(obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

/**
 * expression이 많은 if문을 간단하게 표현 가능함.
 * @see study_2.study_2_1.Test01_Java.judgeNumber
 */
fun judgeNumber(number: Int) {
    when(number) {
        1,0,-1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("1,0,-1이 아닙니다.")
    }
}