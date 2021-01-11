package by.tms.examples.oop.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamFilterExample {
    public static void main(String[] args) {
        Phone[] phonesArray = {new Phone("Panasonic", 1000, "Оранжевый"),
                new Phone("Sony", 2000, "Чёрный", "Фиолетовый"),
                new Phone("Grundig", 3000, "Чёрный", "Белый")};

        Stream<Phone> phones = Stream.of(phonesArray);
        phones
                .filter(p -> p.getPrice() > 1500)
                .filter(p -> p.getName().length() > 4)
                .map(it -> it.getName())
                .forEach(System.out::println);

        int sum = Stream.of(phonesArray).mapToInt(phone -> phone.getPrice()).sum();
        System.out.println("sum of all prices is " + sum);

        Stream.of(phonesArray).flatMap(phone -> phone.getColor().stream()).distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
