package by.tms.examples.oop.collections;

import by.tms.examples.oop.inheritance.Dog;

import java.util.Set;
import java.util.TreeSet;

public class SetWithObjects {
    public static void main(String[] args) {
        Set<Dog> objectsSet = new TreeSet<>(new DoggoWeightComparator().thenComparing(new DoggoNameComparator()));
        objectsSet.add(new Dog());
//        objectsSet.add(new Dog(1_000, "Уголёк"));
        objectsSet.add(new Dog("Пушок"));
        objectsSet.add(new Dog("Снежок"));
        for (Dog item : objectsSet) {
            System.out.println(item);
        }
    }
}
