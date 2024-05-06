package studies.maratonajava.javacore.Zgenerics.test;

import studies.maratonajava.javacore.Ycolections.domain.Consumer;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> list = new ArrayList<>();
        list.add("Gui");
        list.add("Laysa");

        for (String item : list) {
            System.out.println(item);
        }

        add(list, new Consumer("Fernanda"));

        System.out.println("--------------------");

        for (Object item : list) {
            System.out.println(item);
        }
    }

    private static void add(List list, Consumer consumer) {
        list.add(consumer);
    }
}
