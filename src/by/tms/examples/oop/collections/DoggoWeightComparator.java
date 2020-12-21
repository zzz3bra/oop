package by.tms.examples.oop.collections;

import by.tms.examples.oop.inheritance.Dog;

import java.util.Comparator;

public class DoggoWeightComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getWeightInGrams() - o2.getWeightInGrams();
    }
}
