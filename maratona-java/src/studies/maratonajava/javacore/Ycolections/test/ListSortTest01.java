package studies.maratonajava.javacore.Ycolections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Attack on Titan");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");

        Collections.sort(mangas);

        System.out.println(mangas);

        List<Integer> ages = new ArrayList<>(6);
        ages.add(21);
        ages.add(16);
        ages.add(19);
        ages.add(28);

        System.out.println(ages);
    }
}
