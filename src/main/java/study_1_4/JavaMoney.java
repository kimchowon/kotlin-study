package study_1_4;

public class JavaMoney implements Comparable<JavaMoney> {

    private final long amount;

    public JavaMoney(long amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(JavaMoney o) {
        return Long.compare(this.amount, o.amount);
    }
}
