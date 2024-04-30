package studies.maratonajava.javacore.Ycolections.test;

import studies.maratonajava.javacore.Ycolections.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Berserk", 19.99, 0));
        mangas.add(new Manga(2L, "Hellsing Ultimate", 23.99, 5));
        mangas.add(new Manga(4L, "Attack on Titan", 25.99, 0));
        mangas.add(new Manga(1L, "Pokemon", 21.99, 2));
        mangas.add(new Manga(3L, "Dragon Ball Z", 15.99, 0));
        mangas.add(new Manga(3L, "Dragon Ball Z", 15.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
