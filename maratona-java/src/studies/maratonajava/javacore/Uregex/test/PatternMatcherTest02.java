package studies.maratonajava.javacore.Uregex.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = All digits
        // \D = Everything that isn't digits
        // \s = Blank spaces  \t \n \f \r
        // \S = All non-whitespace characters
        // \w = All letters, numbers and underscore
        // \W = Anything that is not letters, numbers or underscore
        String regex = "\\w";

        Scanner input = new Scanner(System.in);
        System.out.println("Regex: " + regex);
        System.out.print("Enter text: ");
        String text = input.next().trim();

        System.out.println("Regex: " + regex);

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Text:  " + text);
        System.out.println("Index: 0123456789");

        System.out.print("\nPositions found: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + ": " + matcher.group() + "; ");
        }
    }
}
