package studies.maratonajava.javacore.Sformat.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = Locale.of("pt", "BR");
        Locale localeEUA = Locale.US;
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] numberFormats = {
                NumberFormat.getCurrencyInstance(),
                NumberFormat.getCurrencyInstance(localeBR),
                NumberFormat.getCurrencyInstance(localeEUA),
                NumberFormat.getCurrencyInstance(localeJP),
                NumberFormat.getCurrencyInstance(localeIT)
        };

        double value = 100000000.2130;
        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.format(value));
        }

        String stringValue = "￥1000";
        try {
            System.out.println(numberFormats[3].parse(stringValue));
        } catch (ParseException e) {
            e.printStackTrace(System.out);
        }

    }
}
