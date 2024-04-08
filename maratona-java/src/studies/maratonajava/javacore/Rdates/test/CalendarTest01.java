package studies.maratonajava.javacore.Rdates.test;

import java.util.Calendar;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingão é o primeiro dia da semana");
        }

        calendar.add(Calendar.HOUR, 2);
        calendar.roll(Calendar.HOUR, 12);

        System.out.println(calendar.getTime());
        System.out.println("Dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia do ano: " + calendar.get(Calendar.DAY_OF_YEAR));
    }
}
