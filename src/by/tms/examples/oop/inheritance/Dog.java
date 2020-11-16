package by.tms.examples.oop.inheritance;

public class Dog extends Animal {
    public Dog() {
        super(2_000, "Уголёк");
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

}
