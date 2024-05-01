package studies.maratonajava.javacore.Ycolections.test;

import studies.maratonajava.javacore.Ycolections.domain.Consumer;
import studies.maratonajava.javacore.Ycolections.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("Guilherme");
        Consumer consumer2 = new Consumer("Dalila");

        Manga manga1 = new Manga(5L, "Berserk", 19.99, 0);
        Manga manga2 = new Manga(2L, "Hellsing Ultimate", 23.99, 5);
        Manga manga3 = new Manga(4L, "Attack on Titan", 25.99, 0);
        Manga manga4 = new Manga(1L, "Pokemon", 21.99, 2);
        Manga manga5 = new Manga(3L, "Dragon Ball Z", 15.99, 0);

        Map<Consumer, Manga> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(consumer1, manga1);
        consumerMangaMap.put(consumer2, manga3);

        System.out.println("{");
        for (Map.Entry<Consumer, Manga> entry : consumerMangaMap.entrySet()) {
            System.out.println("    " + entry.getKey().getName() + ": " + entry.getValue().getName() + ",");
        }
        System.out.println("}");
    }
}
