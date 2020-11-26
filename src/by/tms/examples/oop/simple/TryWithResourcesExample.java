package by.tms.examples.oop.simple;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) throws IOException {

        try (FileInputStream inputStream = new FileInputStream("");
             FileInputStream inputStream2 = new FileInputStream("")) {//will close resources automatically
            inputStream.available();//some work with resource
        } catch (FileNotFoundException e) {
            System.out.println("There's no such file");
        }

        System.out.println("Done");

        try {
            FileInputStream inputStream = new FileInputStream("");
            try {
                FileInputStream inputStream2 = new FileInputStream("");
                try {
                    inputStream.available();//some work with resource
                } finally {
                    inputStream2.close();
                }
            } finally {
                inputStream.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("There's no such file");
        }
        System.out.println("Done2");
    }
}
