package studies.maratonajava.javacore.Ycolections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Amanda");
        names.add("Guilherme");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("-------------");
        names.add("Jessica");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
