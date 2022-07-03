package study_1.study_1_3


/**
 * 1_3.type을 다루는 방법
 * - kotlin에서 문자열 타입을 다루는 방법
 * - String interpolation / String indexing
 */
class Test04 {
}

fun main(args: Array<String>) {
    // $ 정규식
    val person = Person("김초원", 27)
    val log = "사람의 이름은 ${person.name}이고 나이는 ${person.age}세 입니다."

    println(log)

    val name = "김초원"
    println("나의 이름은 $name")

    // 여러 줄에 걸쳐 문자열 작성하기
    var result = """
        ABC
        EFG
        $name
    """.trimIndent()
    println(result)

    // 인덱스를 통해 문자열 중에 일부만 가져오기
    var string = "ABC"
    var str1 = string[0] // A
    var str2 = string[2] // C
    println(str1)
    println(str2)
}

/**
 * <정리>
 * 1.kotlin의 변수는 초기값으로 타입 추론을 하고, 각 변수들끼리 타입 변환은 명시적으로 이루어진다.
 * 2.타입 확인 및 캐스팅 키워드: is, !is, as, as?
 * 3.Any == Java의 Ojbect
 * 4.Unit == Java의 void
 * 5.Nothing == 정상적으로 끝나지 않는 함수의 반환을 의미
 * 6.문자열 가공: ${변수}, """ """
 * 7.문자열에서 문자를 가져올 때 Java의 배열처럼 []를 이용한다.
 */