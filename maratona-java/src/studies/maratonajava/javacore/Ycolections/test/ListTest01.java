package studies.maratonajava.javacore.Ycolections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        names.add("Amanda");
        names.add("Guilherme");
        names.remove("Amanda");

        names2.add("Pedro");
        names2.add("Amanda");

        names.addAll(names2);

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("-------------");
        names.add("Jessica");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        System.out.println(numbers);
    }
}
