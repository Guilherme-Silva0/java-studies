package studies.maratonajava.javacore.Ycolections.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("keyboad", "Keyboard");
        map.put("Mouze", "Mouse");
        map.put("yu", "you");
        map.putIfAbsent("yu", "yo");
        System.out.println(map);

        System.out.println("{");
        for (String key : map.keySet()) {
            System.out.println("    " + key + ": " + map.get(key) + ",");
        }
        System.out.println("}");

        System.out.println("-----------------------");

        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("-----------------------");

        System.out.println("{");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("    " + entry.getKey() + ": " + entry.getValue() + ",");
        }
        System.out.println("}");
    }
}
