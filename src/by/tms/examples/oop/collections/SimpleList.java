package by.tms.examples.oop.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SimpleList {
    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();// for variable type declaration use interface type and not implementation type
        stringArrayList.add("first");
        stringArrayList.add("second");
        System.out.println(stringArrayList.size());
        stringArrayList.add("third");
        stringArrayList.add("fourth");
        System.out.println(stringArrayList.size());

        System.out.println();

        for (String item : stringArrayList) { // for-each loop
            System.out.println(item);
            // will not work
//            if (item.equals("first")) {
//                stringArrayList.remove("first");
//            }
        }

        System.out.println();
        for (Iterator<String> iterator = stringArrayList.iterator(); iterator.hasNext(); ) {
            String item = iterator.next();
            if (item.equals("first")) {
                iterator.remove();
            } else {
                System.out.println(item);
            }
        }

        System.out.println(stringArrayList);
        String elementNumberOne = stringArrayList.get(0);
        System.out.println("First element is " + elementNumberOne);

        System.out.println("List size is " + stringArrayList.size());

        Collections.sort(stringArrayList);
        System.out.println(stringArrayList);

        List<Integer> list = new ArrayList<>(List.of(1, 2));
        list.add(3);
        System.out.println(list);
        List<Integer> unmodifiableList = Collections.unmodifiableList(list);
//        unmodifiableList.add(4);

        LinkedList<String> objects = new LinkedList<>();
        System.out.println("LIFO - stack");
        objects.push("push1");
        objects.push("push2");
        objects.push("push3");
        System.out.println(objects.pop());
        System.out.println(objects.pop());
        System.out.println(objects.pop());

        System.out.println("FIFO - queue");
        objects.offer("push1");
        objects.offer("push2");
        objects.offer("push3");
        System.out.println(objects.poll());
        System.out.println(objects.poll());
        System.out.println(objects.poll());

    }
}
