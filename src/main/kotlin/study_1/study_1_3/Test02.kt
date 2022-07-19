package study_1.study_1_3

import study_1.study_1_2.Person

/**
 * 1_3.type을 다루는 방법
 * - 일반 타입
 */
class Test02 {

}

fun main(args: Array<String>) {
    printAgeIfPerson(null)
}

fun printAgeIfPerson(obj: Any?) {
    // is == Java의 instanceOf
    if (obj is Person) {
        // as: obj를 Person으로 타입 변환하여 넣는다. == Java의 (Person)obj
        val person = obj as? Person;
        print(person?.name)
    }
}

fun printAgeIfNotPerson(obj: Any) {
    if (obj !is Person) {
        println("obj is not Person Type.")
    }
}