package by.tms.examples.oop.simple;

import by.tms.examples.oop.inheritance.SmallBeresta;

public class ObjectExample {
    public static void main(String[] args) {
        SmallBeresta instance = new SmallBeresta();

        System.out.println(new SmallBeresta());
        System.out.println(new SmallBeresta() + "");
        System.out.println(new SmallBeresta().toString());
        System.out.println(new SmallBeresta().toString() + "");

        // "PASSWORD" =>
        // хэш-функция =>
        // <числовое значение типа int>

        // коллизия - два набора данных вернут тот же хэш-код

        SmallBeresta beresta1 = new SmallBeresta();
        SmallBeresta beresta2 = new SmallBeresta();
        boolean isBer1EqualsBer1 = beresta1.equals(beresta1);
        boolean isBer1EqualsNull = beresta1.equals(null);
        boolean isBer1EqualsBer2 = beresta1.equals(beresta2);
        boolean isBer1EqualsBerAnonymous = beresta1.equals(new SmallBeresta() {

        });
        boolean isBer1EqualsString = beresta1.equals("белиберда");

        SmallBeresta smallBeresta1copy = new SmallBeresta(beresta1);

        String s1 = new String("2");//second object allocation due to constructor invocation
        String s2 = "2";//literal - string pool

        StringBuilder builder = new StringBuilder();
        builder.append("22");
        builder.append("string");
        builder.append("string");
        builder.append("string");
        builder.append("string");
        builder.append("string");
        builder.append("string");//length 38
        System.out.println("builder length " + builder.length());
        System.out.println("builder capacity " + builder.capacity());
        String result = builder.toString();
        System.out.println("string builder result is: " + result);

        System.out.println(System.currentTimeMillis());
        //trigger GC
        String tmp = "a";
        while (true) {
            tmp += tmp;
        }
    }
}
