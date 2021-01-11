package by.tms.examples.oop.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectExample {
    public static void main(String[] args) {
        Phone[] phonesArray = {new Phone("Panasonic", 1000, "Оранжевый"),
                new Phone("Sony", 2000, "Чёрный", "Фиолетовый"),
                new Phone("Sony", 2500, "Чёрный", "Фиолетовый"),
                new Phone("Grundig", 3000, "Чёрный", "Белый")};

        List<Phone> phoneList = Stream.of(phonesArray).filter(p -> p.getColor().size() > 1).collect(Collectors.toList());
        System.out.println("Phones from list:");
        phoneList.forEach(System.out::println);

        List<Phone> phoneListBadPractice = new ArrayList<>();
        Stream.of(phonesArray).filter(p -> p.getColor().size() > 1).forEach(phoneListBadPractice::add);//bad practice - side effects and shared mutable state
        System.out.println("Phones from bad practice list:");
        phoneListBadPractice.forEach(System.out::println);

        Set<Phone> phoneSet = Stream.of(phonesArray).filter(p -> p.getColor().size() > 1).collect(Collectors.toSet());
        System.out.println("Phones from set:");
        phoneSet.forEach(System.out::println);

        Set<Phone> phoneCustomSet = Stream.of(phonesArray).filter(p -> p.getColor().size() > 1).collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Phone::getName))));
        System.out.println("Phones from custom set:");
        phoneCustomSet.forEach(System.out::println);

        Map<String, List<Phone>> phoneMap = Stream.of(phonesArray).filter(p -> p.getColor().size() > 1).collect(Collectors.toMap(it -> it.getName(), it -> {
            ArrayList<Phone> list = new ArrayList<>();
            list.add(it);
            return list;
        }, (p1, p2) -> {
            p1.addAll(p2);
            return p1;
        }));
        System.out.println("Phones from map:");
        phoneMap.entrySet().forEach(System.out::println);
    }
}
