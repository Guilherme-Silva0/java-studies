package studies.maratonajava.javacore.Rdates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = Locale.of("it", "IT");
        Locale localeCH = Locale.of("it", "CH");
        Locale localeIndia = Locale.of("hi", "IN");
        Locale localeJapan = Locale.of("ja", "JP");
        Locale localeHolanda = Locale.of("nl", "NL");
        Locale localeBrazil = Locale.of("pt", "BR");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);

        System.out.println(localeItaly.getDisplayCountry(localeItaly) + " " + df1.format(calendar.getTime()));
        System.out.println(localeCH.getDisplayCountry(localeCH) + " " + df2.format(calendar.getTime()));
        System.out.println(localeIndia.getDisplayCountry(localeIndia) + " " + df3.format(calendar.getTime()));
        System.out.println(localeJapan.getDisplayCountry(localeJapan) + " " + df4.format(calendar.getTime()));
        System.out.println(localeHolanda.getDisplayCountry(localeHolanda) + " " + df5.format(calendar.getTime()));
        System.out.println(localeBrazil.getDisplayCountry(localeBrazil) + " " + df6.format(calendar.getTime()));
    }
}
