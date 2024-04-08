package studies.maratonajava.javacore.Rdates.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] dateFormats = {
                DateFormat.getInstance(),
                DateFormat.getDateInstance(),
                DateFormat.getDateTimeInstance(),
                DateFormat.getDateInstance(DateFormat.SHORT),
                DateFormat.getDateInstance(DateFormat.MEDIUM),
                DateFormat.getDateInstance(DateFormat.LONG),
                DateFormat.getDateInstance(DateFormat.FULL)
        };

        for (DateFormat dateFormat : dateFormats) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
