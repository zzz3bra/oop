package by.tms.examples.oop.inheritance;

public class Cat extends Animal {
    private int age;

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
        System.out.printf("Имя: %s \t Возраст: %s \t Вес, кг: %.3f \n", getName(), getAge(), getWeightInGrams() / 1000.0);
    }
}
