package by.tms.examples.oop.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamOptionalObjectsExample {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
//        phones.add(new Phone("name",1));
        Phone anyPhone = phones.stream().findAny().get();
    }
}
