package by.tms.examples.oop.date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Date now: " + now);
        System.out.println(now.getTime());

        LocalDate now1 = LocalDate.now(); // ISO8601
        System.out.println(now1);
        System.out.println(now1.minus(5, ChronoUnit.YEARS));

        LocalDate localDateStartOfYear = LocalDate.parse("2020-01-01");
        System.out.println(localDateStartOfYear);

        System.out.println();

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        System.out.println();

        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println("LocalDateTime now: " + localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(2007, 2, 2, 14, 0);
        System.out.println(localDateTime2);

        Instant instant = Instant.now();
        System.out.println("Instant now: " + instant);
        Date dateFromInstant = new Date(instant.toEpochMilli());
        Instant instantFromDate = dateFromInstant.toInstant();
        System.out.println("Instant converted back and forth: " + instantFromDate);

        System.out.println();

        Period period = Period.between(localDateStartOfYear, now1);
        System.out.println("Period between " + localDateStartOfYear + " and " + now1 + " is " + period);

        Duration ninetyMinutes = Duration.of(90, ChronoUnit.MINUTES);
        System.out.println(ninetyMinutes);

        LocalDateTime nowMinusNinetyMinutes = localDateTime1.minus(ninetyMinutes);
        System.out.println("Now minus 90 minutes " + nowMinusNinetyMinutes);

    }
}
