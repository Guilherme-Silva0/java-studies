package studies.maratonajava.javacore.Ycolections.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "a");
        map.put("D", "d");
        map.put("B", "b");
        map.put("C", "c");
        map.put("E", "e");

        System.out.println("{");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("    " + entry.getKey() + ": " + entry.getValue() + ",");
        }
        System.out.println("}");

        System.out.println(map.headMap("C", true));
    }
}
