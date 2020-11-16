package by.tms.examples.oop.simple;

public class InnerClassExample {
    public static void main(String[] args) {
        EnclosingClass enclosingClass = new EnclosingClass();
        System.out.println(enclosingClass.getName());
        System.out.println(enclosingClass.getInner().getSurname());
        System.out.println("-----------------");

        enclosingClass.getInner().displayInfo();
        System.out.println("-----------------");

        enclosingClass.getInner().modifyEnclosing();
        enclosingClass.getInner().displayInfo();
        System.out.println("-----------------");

        System.out.println(enclosingClass.getName());
        System.out.println(enclosingClass.getInner().getSurname());
    }
}
