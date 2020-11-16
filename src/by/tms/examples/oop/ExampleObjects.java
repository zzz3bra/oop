package by.tms.examples.oop;

import by.tms.examples.oop.inheritance.Animal;

public class ExampleObjects {
    public static void main(String[] args) {
        Animal bigCat = Animal.newAnimal(5_000, "Котик");
        printAnimalInfo(bigCat);
        bigCat.displayInfo();

        System.out.println();

        Animal smallKitten = Animal.newAnimal(1_300, "Котёнок");
        printAnimalInfo(smallKitten);
        smallKitten.displayInfo();
    }

    private static void printAnimalInfo(Animal animal) {
        System.out.println("Имя:" + animal.getName());
        System.out.println("Вес в граммах:" + animal.getWeightInGrams());
    }
}