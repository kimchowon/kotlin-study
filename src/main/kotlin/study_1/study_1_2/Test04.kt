package study_1.study_1_2

import study_1_2.Person

/**
 * 1-2.null을 다루는 방법
 * - Java와 Kotlin을 병행해서 쓰는 경우에 Kotlin에서 Java 변수의 null 처리
 */
class Test04 {
}

fun main(args: Array<String>) {

    val person = Person("김초원")

    /**
     * Kotlin이 Person 클래스의 name 변수에 @NotNull 애노테이션을 이해한다.
     */
    startWithA(person.name)

    /**
     * 플랫폼 타입: null의 허용 여부를 명지하지 않은 타입
     * 만약 Java 클래스의 변수에 @Nullable 또는 @NotNull과 같은 애노테이션이 붙어있지 않으면 Kotlin에서는 null의 허용 여부를 알 수가 없다.
     * 이런 경우 컴파일 타임에서는 에러가 나지 않지만 런타임 시에 NPE가 발생할 수 있다.
     */
}

fun startWithA(str: String): Boolean {
    return str.startsWith("A")
}

/**
 * <정리>
 * 1.Kotlin에서 null이 들어갈 수 있는 타입은 완전히 다르게 간주된다.
 * 2.Safe Call: null이 아닌 경우에만 실행되는 메소드, null인 경우에는 그냥 null을 반환
 * 3.Elvis 연산자: 반환값이 null인 경우에만 호출
 * 4.!!(단언 키워드): null이 절대 아니라고 컴파일러에게 선언
 * 5.Kotlin에서 Java 코드를 사용할 때 Java의 플랫폼 타입 사용에 유의
 */