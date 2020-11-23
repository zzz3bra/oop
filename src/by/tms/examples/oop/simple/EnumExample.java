package by.tms.examples.oop.simple;

public class EnumExample {
    public static final String MONDAY = "Monday";
    public static final String TUESDAY = "Tuesday";
    public static final String[] DAYS = {MONDAY, TUESDAY};

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.printf("Enum name %s, day number %d, is working=%s%n%s%n",
                    day.name(), day.getDayNumber(), !day.isNonWorkingDay(), day);
        }
        System.out.println();

        Day monday = Day.valueOf("MONDAY");
        printEnum(monday);

        System.out.println("Are monday equals monday? " +
                (Day.MONDAY == monday));
    }

    public static void printEnum(Day day) {
        System.out.println(day.getClass().getSuperclass().getSuperclass());
    }
}
