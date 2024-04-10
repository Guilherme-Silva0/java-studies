package studies.maratonajava.javacore.Sformat.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20240410", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2024-04-10", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2024-04-10", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String format1 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(format1);

        LocalDateTime parseDateTime = LocalDateTime.parse("2024-04-10T11:28:57.620644163", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parseDateTime);

        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(LocalDate.now().format(formatterBR));
        System.out.println(LocalDate.parse("10/04/2024", formatterBR));

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        System.out.println(LocalDate.now().format(formatterGR));
        System.out.println(LocalDate.parse("10.April.2024", formatterGR));
    }
}
