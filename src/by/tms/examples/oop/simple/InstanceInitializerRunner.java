package by.tms.examples.oop.simple;

import java.util.Arrays;

public class InstanceInitializerRunner {
    public static void main(String[] args) {
//        InstanceInitializer.staticMethod();
        System.out.println(Arrays.toString(InstanceInitializer.CONST));
        InstanceInitializer.CONST[0] = "garbage";
//        InstanceInitializer.CONST = new String[]{"fail"}; - не работает: нельзя поменять ссылку поля с модификатором final
        System.out.println(Arrays.toString(InstanceInitializer.CONST));

        InstanceInitializer firstInstance = new InstanceInitializer();
        firstInstance.instanceMethod();
        firstInstance.staticMethod();

        InstanceInitializer secondInstance = new InstanceInitializer();
        secondInstance.instanceMethod();
        secondInstance.staticMethod();

        InstanceInitializer.staticMethod();
    }
}
