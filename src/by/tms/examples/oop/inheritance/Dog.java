package by.tms.examples.oop.inheritance;

public class Dog extends Animal implements Comparable<Dog> {
    public Dog() {
        super(2_000, "Уголёк");
    }

    public Dog(String name) {
        super(2_000, name);
    }

    public Dog(int weightInGrams, String name) {
        super(weightInGrams, name);
    }

    @Override
    public void speak() {
        bark();
    }

    public void bark() {
        System.out.println(getName() + ":Bark");
    }

    public final void finalMethod() {//метд нельзя переопределить в классах-наследниках
        //do nothing
    }

    @Override
    public String toString() {
        return getName() + ":" + getWeightInGrams();
    }

    @Override
    public int compareTo(Dog o) {
        return getName().compareTo(o.getName());
    }
}
