package by.tms.examples.oop.collections;

import by.tms.examples.oop.inheritance.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapWithObjects {
    public static void main(String[] args) {
        Map<Integer, Dog> map = new HashMap<>();
        Dog coaly = new Dog(2_000, "Уголёк");
        map.put(coaly.getWeightInGrams(), coaly);
        Dog whitey = new Dog(2_000, "Снежок");
        map.put(whitey.getWeightInGrams(), whitey);

        for (Map.Entry<Integer, Dog> entry : map.entrySet()) {
            System.out.println(entry);
        }

        Dog dogWithWeightTwoThousands = map.get(2000);
        System.out.println(dogWithWeightTwoThousands);

        HashMap<Integer, List<Dog>> mapOfLists = new HashMap<>();
        mapOfLists.putIfAbsent(coaly.getWeightInGrams(), new ArrayList<>());
        mapOfLists.get(coaly.getWeightInGrams()).add(coaly);

        mapOfLists.putIfAbsent(whitey.getWeightInGrams(), new ArrayList<>());
        mapOfLists.get(whitey.getWeightInGrams()).add(whitey);

        for (Map.Entry<Integer, List<Dog>> entry : mapOfLists.entrySet()) {
            System.out.println(entry);
        }

        mapOfLists.remove(null);
    }
}
