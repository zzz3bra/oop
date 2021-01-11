package by.tms.examples.oop.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamOptionalPrimitiveExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        int max = integers.stream().mapToInt(value -> value).max().getAsInt();
    }
}
