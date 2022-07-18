package study_1_4;

public class Lec04Main {
    public static void main(String[] args) {
        JavaMoney javaMoney1 = new JavaMoney(2000L);
        JavaMoney javaMoney2 = new JavaMoney(1000L);

        if (javaMoney1.compareTo(javaMoney2) > 0) {
            System.out.println("javaMoney1이 javaMoney2보다 큽니다.");
        }
    }
}
