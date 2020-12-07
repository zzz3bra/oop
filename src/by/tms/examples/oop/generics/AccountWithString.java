package by.tms.examples.oop.generics;

public class AccountWithString {
    private String id;
    private int sum;

    public AccountWithString(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
