package study_1_2;

public class JavaCode {

    /**
     * null이 들어갈 수 없는 결과값이 반환
     */
    public boolean startWithA1(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null이 들어있습니다.");
        }
        return str.startsWith("A");
    }

    /**
     * null이 들어갈 수 있는 결과값이 반환
     */
    public Boolean startWithA2(String str) {
        if (str == null) {
            return null;
        }
        return str.startsWith("A");
    }

    /**
     * null이 들어갈 수 없는 결과값이 반환
     */
    public boolean startWithA3(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("A");
    }
}