package by.tms.examples.oop.inheritance;

import java.io.Serializable;

public abstract class Animal implements Serializable {

    private int weightInGrams = 1_000;
    private String name;

    protected Animal() {
    }

    protected Animal(int weightInGrams, String name) {
        this.weightInGrams = weightInGrams;
        this.name = name;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.printf("Имя: %s \t Вес, кг: %.3f \n", name, weightInGrams / 1000.0);
    }

    // метод без тела который должен быть переопределен в классах-наследниках
    protected abstract void speak();

    /**
     * Factory method which returns an instance of Animal.
     */
    public static Animal newAnimal(int weightInGrams, String name) {
        //валидация

        if (weightInGrams < 1) {
            throw new RuntimeException("Отрицательный вес запрещен");
        }
        if (name.length() > 100) {
            throw new RuntimeException("Труднопроизносимое имя");
        }

        Animal animal = new Animal() { // анонимный класс
            @Override
            public void speak() {
                System.out.println("Таинственное молчание");
            }
        };
        animal.name = name;
        animal.weightInGrams = weightInGrams;
        return animal;
    }
}
