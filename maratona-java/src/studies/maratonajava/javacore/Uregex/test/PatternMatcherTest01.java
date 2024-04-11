package studies.maratonajava.javacore.Uregex.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String regex = "ab";

        System.out.println("Regex: " + regex);
        System.out.print("Enter text: ");
        String text = input.next().trim();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Text:  " + text);
        System.out.println("Index: 0123456789");

        if (!matcher.find()) {
            System.out.println("Not found!");
            return;
        }

        System.out.print("\nPositions found: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
