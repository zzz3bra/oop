package by.tms.examples.oop.inheritance;

public final class GrumpyCat extends Cat { // от данного класса нельзя наследоваться
    @Override
    public void speak() {
        //do nothing - i'm too grumpy for talking
    }
}
