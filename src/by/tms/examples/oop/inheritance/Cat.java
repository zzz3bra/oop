package by.tms.examples.oop.inheritance;

import java.awt.*;
import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    private static final long serialVersionUID = 1L;
    private int age;
    private Color color = Color.GREEN;

    public Cat() {
        super(1_000, "Снежок");
    }

    @Override
    public void speak() {
        meow();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow() {
        System.out.println(getName() + ":Meow");
    }

    public void displayInfoForCat() {
        System.out.printf("Имя: %s \t Возраст: %s \t Вес, кг: %.3f, цвет : %s \n", getName(), getAge(), getWeightInGrams() / 1000.0, color);
    }
}
