package studies.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = All digits
        // \D = Everything that isn't digits
        // \s = Blank spaces  \t \n \f \r
        // \S = All non-whitespace characters
        // \w = All letters, numbers and underscore
        // \W = Anything that is not letters, numbers or underscore
        // [] = Range
        // ? = 0 or 1
        // * = 0 or more
        // + = 1 or more
        // {n,m} = From n to m
        // () = group
        // | = Or
        // $ = End line
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        System.out.println("Regex: " + regex);
        String text = "12 0x 0x 0xFFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Text:  " + text);
        System.out.println("Index: 0123456789");

        StringBuilder assembledText = new StringBuilder();

        System.out.print("\nPositions found: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + ": " + matcher.group() + "; ");
            assembledText.append(matcher.group());
        }
        System.out.println("\nAssembled String: " + assembledText);
    }
}
