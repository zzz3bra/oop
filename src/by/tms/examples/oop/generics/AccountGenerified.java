package by.tms.examples.oop.generics;

import java.io.Serializable;

public class AccountGenerified<T extends Serializable> { // example of generic bounds
    private T id;
    private int sum;

    public AccountGenerified(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public <S extends Number> void customGenerifiedMethod(S customType, T classType) {
        System.out.println(customType.byteValue());
        System.out.println(customType.getClass().getName());

        System.out.println(classType.getClass().getName());

        //S s = (S) 42;
        // code above is not working due to type erasure

        //boolean b = "string" instanceof S;
        // code above is not working due to type erasure
    }
}
