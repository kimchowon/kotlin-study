package study_1.study_1_2

/**
 * 1-2.null을 다루는 방법
 * - 단언 키워드(!!)
 */
class Test03 {

}

fun startWithA4(str: String?): Boolean {
    /**
     * null일 수도 있는 변수를 파라미터로 받았지만 곰곰히 생각해보니 절대 null일수가 없는 값일 때 !! 키워드 사용
     * 그럼 처음부터 null을 허용하지 않는 파라미터를 받으면 되는 것 아닌가..? 어떤 상황에 사용하는 것인지..
     * 컴파일 타임에서 에러는 안나지만 파라미터가 null인 경우에 런타임에서 NPE가 나기 때문에 정말 null이 아닌게 확실한 경우에만 !! 키워드를 사용해야 한다.
     */
    return str!!.startsWith("A");
}