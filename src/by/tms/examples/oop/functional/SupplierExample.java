package by.tms.examples.oop.functional;

import java.util.Random;
import java.util.StringJoiner;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Random random = new Random();

        Supplier<Tree> treeSupplier = () -> {
            return new Tree(random.nextInt());
        };

        printSupplierResult(treeSupplier);
        printSupplierResult(treeSupplier);
        printSupplierResult(treeSupplier);
        printSupplierResult(() -> new Tree());
        printSupplierResult(Tree::new);

        printSupplierResult(() -> customConstructorCall(123));
        printSupplierResult(customConstructorCallWithSupplier(123));
    }

    private static Tree customConstructorCall(int x) {
        return new Tree(x);
    }

    private static Supplier<Tree> customConstructorCallWithSupplier(int x) {
        return () -> new Tree(x);
    }

    private static void printSupplierResult(Supplier<Tree> supplier) {
        System.out.println(supplier.get());
    }

    private static class Tree {
        int age;

        public Tree(int i) {
            age = i;
        }

        public Tree() {
            age = 1;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Tree.class.getSimpleName() + "[", "]")
                    .add("age=" + age)
                    .toString();
        }
    }
}
