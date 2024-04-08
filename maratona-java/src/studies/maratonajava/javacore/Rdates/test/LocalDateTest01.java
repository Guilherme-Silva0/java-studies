package studies.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, Month.APRIL, 22);
        LocalDate now = LocalDate.now();
        System.out.println(date.getYear());
        System.out.println(date.getMonthValue() + " " + date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR_OF_ERA));

        System.out.println(date);
        System.out.println(now);

        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.MAX);
    }
}
