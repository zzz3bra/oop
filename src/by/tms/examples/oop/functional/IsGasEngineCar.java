package by.tms.examples.oop.functional;

public class IsGasEngineCar implements CheckCar {
    @Override
    public boolean test(Car car) {
        return car.isGasEngine();
    }
}
