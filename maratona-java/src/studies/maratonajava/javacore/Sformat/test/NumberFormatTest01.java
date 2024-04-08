package studies.maratonajava.javacore.Sformat.test;

import java.text.NumberFormat;
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

        double value = 100000000.2130;
        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.format(value));
        }

    }
}
