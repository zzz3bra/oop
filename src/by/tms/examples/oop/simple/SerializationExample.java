package by.tms.examples.oop.simple;

import by.tms.examples.oop.inheritance.Cat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat catOneHundred = new Cat();
        catOneHundred.setAge(100);

        Cat catTwoHundreds = new Cat();
        catTwoHundreds.setAge(200);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cat.bin"))) {
            objectOutputStream.writeObject(catOneHundred);
            objectOutputStream.writeObject(catTwoHundreds);
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("cat.bin"))) {
            Cat firstObject = (Cat) objectInputStream.readObject();
            firstObject.displayInfoForCat();

            Cat secondObject = (Cat) objectInputStream.readObject();
            secondObject.displayInfoForCat();
        }
    }
}
