package studies.maratonajava.javacore.Sformat.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = Locale.of("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] numberFormats = {
                NumberFormat.getInstance(),
                NumberFormat.getInstance(localeBR),
                NumberFormat.getInstance(localeJP),
                NumberFormat.getInstance(localeIT)
        };

        double value = 1000.2130;
        for (NumberFormat numberFormat : numberFormats) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(value));
        }

        String stringValue = "1000.2130";
        try {
            System.out.println(numberFormats[1].parse(stringValue));
        } catch (ParseException e) {
            e.printStackTrace(System.out);
        }

    }
}
