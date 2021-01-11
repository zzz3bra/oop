package by.tms.examples.oop.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduceExample {
    public static void main(String[] args) {
        Phone[] phonesArray = {new Phone("Panasonic", 1000, "Оранжевый"),
                new Phone("Sony", 2000, "Чёрный", "Фиолетовый"),
                new Phone("Grundig", 3000, "Чёрный", "Белый")};

        Stream<Phone> phones = Stream.of(phonesArray);
        Optional<Phone> phoneWithFiltersApplied = phones
                .filter(p -> p.getPrice() > 1500)
                .filter(p -> p.getName().length() > 10)
                .findAny();
        phoneWithFiltersApplied.ifPresent(System.out::println);

        int sum = Stream.of(phonesArray).mapToInt(phone -> phone.getPrice()).sum(); // special case of reduction
        System.out.println("sum of all prices is " + sum);

        // all tehse operations are short-circuiting
        boolean allPhonesCostMoreOneHundred = Stream.of(phonesArray).allMatch(phone -> phone.getPrice() > 100 && phone.getColor().size() > 1);
        System.out.println("phones.price > 100 && more than one color ? " + allPhonesCostMoreOneHundred);

        boolean noPhonesCostMoreOneHundred = Stream.of(phonesArray).noneMatch(phone -> phone.getPrice() > 100 && phone.getColor().size() > 1);
        System.out.println("!(phones.price > 100 && more than one color) ? " + noPhonesCostMoreOneHundred);

        boolean atLeastOnePhonesCostMoreOneHundred = Stream.of(phonesArray).anyMatch(phone -> {
            System.out.println("Processing " + phone);
            return phone.getPrice() > 100 && phone.getColor().size() > 1;
        });
        System.out.println("(phones.price > 100 && more than one color).size >= 1 ? " + atLeastOnePhonesCostMoreOneHundred);

    }
}
