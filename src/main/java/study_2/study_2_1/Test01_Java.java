package study_2.study_2_1;

public class Test01_Java {

    public static void main(String[] args) {

    }

    private void judgeNumber(int number) {
        if (number == 1 || number == 0 || number == -1) {
            System.out.println("어디서 많이 본 숫자입니다.");
        }else {
            System.out.println("1, 0, -1이 아닙니다.");
        }
    }
}
