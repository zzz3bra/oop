package by.tms.examples.oop.simple;

public enum Day {

    MONDAY(1),
    TUESDAY(2),
    SATURDAY(6, true);

    private int dayNumber;
    private boolean isNonWorkingDay;

    Day(int dayNumber, boolean isNonWorkingDay) { // constructor invoked by JVM
        this.dayNumber = dayNumber;
        this.isNonWorkingDay = isNonWorkingDay;
    }

    Day(int dayNumber) {
       this(dayNumber, false);
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public boolean isNonWorkingDay() {
        return isNonWorkingDay;
    }

    @Override
    public String toString() {
        return name() + " is day number " + dayNumber + " which is "
                + (isNonWorkingDay ? "not" : "") + " working day";
    }
}
