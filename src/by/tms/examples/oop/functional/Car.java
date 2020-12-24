package by.tms.examples.oop.functional;

import java.util.StringJoiner;

public class Car {
    private boolean isGasEngine;
    private boolean isFullDrive;
    private String name;

    public Car(String name, boolean isFullDrive, boolean isGasEngine) {
        this.isGasEngine = isGasEngine;
        this.isFullDrive = isFullDrive;
        this.name = name;
    }

    public boolean isGasEngine() {
        return isGasEngine;
    }

    public void setGasEngine(boolean gasEngine) {
        isGasEngine = gasEngine;
    }

    public boolean isFullDrive() {
        return isFullDrive;
    }

    public void setFullDrive(boolean fullDrive) {
        isFullDrive = fullDrive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("isGasEngine=" + isGasEngine)
                .add("isFullDrive=" + isFullDrive)
                .add("name='" + name + "'")
                .toString();
    }
}
