package study_1.study_1_4;

public class Lec04Main {
    public static void main(String[] args) {
        JavaMoney javaMoney1 = new JavaMoney(2000L);
        JavaMoney javaMoney2 = javaMoney1;
        JavaMoney javaMoney3 = new JavaMoney(2000L);

        if (javaMoney1.compareTo(javaMoney2) > 0) {
            System.out.println("javaMoney1이 javaMoney2보다 큽니다.");
        }

        // 주소 확인(동일성)
        System.out.println(javaMoney1 == javaMoney2);
        System.out.println(javaMoney1 == javaMoney3);

        // 값 확인(동등성)
        System.out.println(javaMoney1.equals(javaMoney3));
    }
}
