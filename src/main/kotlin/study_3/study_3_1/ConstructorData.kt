package study_3.study_3_1

// kotlin은 default 접근 제한자가 public
class Person constructor(
    name: String = "chocho",
    age: Int = 1
) {

    // custom setter
    // getter는 자동으로 생성
    var name = name
        set(value) {
            field = value.toUpperCase()
        }

    // getter, setter가 자동으로 생성된다.
    var age: Int = age

    // 초기화 블록 - 생성자가 호출되기 바로 직전에 먼저 실행된다.
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
        }
    }

    // 추가 생성자
    // 기본 생성자를 그대로 호출하는 역할의 생성자
    constructor(name: String) : this(name, 1) {
        println("추가 생성자 (부생성자)")
    }

    // 함수 생성
    /*
    fun isAdult(): Boolean {
        return this.age >= 20
    }
    */

    // 위의 isAdult 함수를 변수로도 표현 가능
    // custom getter
    val isAdult: Boolean
        get() = this.age >= 20

    fun getUppercaseName(): String {
        return this.name.toUpperCase()
    }
}

// contructor 키워드 생략 가능
// 생성자에서 바로 필드 생성 가능
// class Person (val name: String, var age: Int)

// 필드가 하나도 없는 클래스 - 기본 생성자가 자동으로 생성
class Student

