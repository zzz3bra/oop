package by.tms.examples.oop.generics;

import java.util.UUID;

public class ExampleShowcase {
    public static void main(String[] args) {
        //PECS

        Account account = new Account(123, 1_000_000);
        System.out.printf("Account ID: %s\t Current amount of money is %d%n", account.getId(), account.getSum());

        AccountWithString accountWithString = new AccountWithString("string_id", 2_000_000);
        String accountWithStringId = accountWithString.getId();
        System.out.printf("Account ID: %s\t Current amount of money is %d%n", accountWithStringId, accountWithString.getSum());

        AccountGenerified<UUID> uuidAccountGenerified = new AccountGenerified<UUID>(UUID.randomUUID(), 3_000_000);
        System.out.printf("Account ID: %s\t Current amount of money is %d%n", uuidAccountGenerified.getId(), uuidAccountGenerified.getSum());

        AccountGenerified<String> stringAccountGenerified = new AccountGenerified<>("generified_string_id", 4_000_000);// <> - diamond operator
        System.out.printf("Account ID: %s\t Current amount of money is %d%n", stringAccountGenerified.getId(), stringAccountGenerified.getSum());

        AccountGenerified<Integer> intAccountGenerified = new AccountGenerified<Integer>(42, 5_000_000); // boxing - primitive->wrapper
        int intAccountGenerifiedIdUnboxed = intAccountGenerified.getId(); // unboxing - wrapper->primitive
        Integer intAccountGenerifiedId = intAccountGenerified.getId(); // no unboxing
        if (intAccountGenerifiedIdUnboxed == intAccountGenerifiedId) {
            System.out.println("Unboxed and wrapper are equal");
        }

        Integer an42first = Integer.valueOf(42);// inside integers cache/pool
        Integer an42second = 42;
        if (an42first == an42second) {
            System.out.println("42: Objects are the same object");
        }
        if (an42first.equals(an42second)) {
            System.out.println("42: Primitive values inside wrappers are the same object");
        }

        Integer an200first = Integer.valueOf(200);// outside integers cache/pool
        Integer an200second = 200;
        Integer an200third = 200;
        if (an200first == an200second) {
            System.out.println("200: First literal and object from static method are the same object");
        }
        if (an200second == an200third) {
            System.out.println("200: Both literals are the same object");
        }
        if (an200first.equals(an200second)) {
            System.out.println("200: Primitive values inside wrappers are the same object");
        }

        System.out.printf("Account ID: %s\t Current amount of money is %d%n", intAccountGenerified.getId(), intAccountGenerified.getSum());

        AccountGenerified<Long> longAccountGenerified = new AccountGenerified<Long>(43L, 6_000_000);
        System.out.printf("Account ID: %s\t Current amount of money is %d%n", longAccountGenerified.getId(), longAccountGenerified.getSum());

        longAccountGenerified.customGenerifiedMethod(500, 400L); // 500 will cause overflow

        int compareResult = longAccountGenerified.getId().compareTo(new AccountGenerified<Long>(55L, 6_000_000).getId());

        Boolean wrappedBoolean;
        Void wrappedVoid;

        //in compiled form code will look like this:
        AccountGenerified iCompiledAccountGenerified = new AccountGenerified(50, 7_000_000);
        Integer idInteger = (Integer) iCompiledAccountGenerified.getId();
        System.out.printf("Account ID: %s\t Current amount of money is %d%n", idInteger, iCompiledAccountGenerified.getSum());

        AccountGenerified sCompiledAccountGenerified = new AccountGenerified("string", 7_000_000);
        String idString = (String) sCompiledAccountGenerified.getId();
        System.out.printf("Account ID: %s\t Current amount of money is %d%n", idString, sCompiledAccountGenerified.getSum());
    }
}
