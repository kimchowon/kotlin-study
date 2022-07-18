package study_1.study_1_4

data class Money(val amount: Long) {

    // 연산자 오버로딩 메서드
    operator fun plus(other: Money): Money {
        return Money(this.amount + other.amount)
    }
}
