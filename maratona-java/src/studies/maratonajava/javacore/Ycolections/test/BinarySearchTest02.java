package studies.maratonajava.javacore.Ycolections.test;

import studies.maratonajava.javacore.Ycolections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Berserk", 19.99));
        mangas.add(new Manga(2L, "Hellsing Ultimate", 23.99));
        mangas.add(new Manga(4L, "Attack on Titan", 25.99));
        mangas.add(new Manga(1L, "Pokemon", 21.99));
        mangas.add(new Manga(3L, "Dragon Ball Z", 15.99));

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(4L, "Attack on Titan", 25.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch));
    }
}
