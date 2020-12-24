package by.tms.examples.oop.functional;

import java.util.List;
import java.util.function.Consumer;

public class ExampleMain {

    public static final Consumer<Object> PRINT_TWO_TIMES = it -> {
        System.out.println(it);
        System.out.println(it);
    };

    public static void main(String[] args) {
        Car audiA3 = new Car("Audi A3", false, true);
        Car audiA6 = new Car("Audi A6", false, false);
        Car audiA8 = new Car("Audi A6", false, true);
        printTest(audiA3, new IsGasEngineCar()); // class implementation
        printTest(audiA6, new CheckCar() { // anonymous implementation
            @Override
            public boolean test(Car car) {
                return car.isGasEngine();
            }
        });
        printTest(audiA8, car -> car.isGasEngine()); // lambda implementation
        printTest(audiA8, Car::isGasEngine); // method reference implementation

        System.out.println("Now printing all cars");

        List<Car> cars = List.of(audiA3, audiA6, audiA8);
        cars.forEach(car -> { // lambda implementation
            System.out.println(car);
            System.out.println(car);
        });

        System.out.println("Now printing all cars using shared consumer");

        List<Car> cars2 = List.of(audiA3, audiA6, audiA8);
        cars2.forEach(PRINT_TWO_TIMES);

        List.of("string1", "string2").forEach(PRINT_TWO_TIMES);
    }

    private static void printTest(Car car, CheckCar checkCar) {
        if (checkCar.test(car)) {
            System.out.println(car);
        }
    }
}
