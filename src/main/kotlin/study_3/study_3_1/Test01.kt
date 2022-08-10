package study_3.study_3_1

/**
 * 03.kotlin에서의 OOP
 * 03_1.kotlin에서 클래스를 다루는 방법
 */
class Test01 {
}

fun main(args: Array<String>) {

    val person = Person("chocho", 27)

    // getter와 같은 역할
    println(person.name)

    // setter와 같은 역할
    person.age = 28
}