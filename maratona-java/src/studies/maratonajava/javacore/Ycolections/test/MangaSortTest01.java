package studies.maratonajava.javacore.Ycolections.test;

import studies.maratonajava.javacore.Ycolections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByNameComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga, Manga manga2) {
        return manga.getName().compareTo(manga2.getName());
    }
}

class MangaByPriceComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga, Manga manga2) {
        return manga.getPrice().compareTo(manga2.getPrice());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Berserk", 19.99));
        mangas.add(new Manga(2L, "Hellsing Ultimate", 23.99));
        mangas.add(new Manga(4L, "Attack on Titan", 25.99));
        mangas.add(new Manga(1L, "Pokemon", 21.99));
        mangas.add(new Manga(3L, "Dragon Ball Z", 15.99));

        System.out.println("---------------- Not sorted ----------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------------- Sorted ----------------");
        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------------- Sorted by name ----------------");
        mangas.sort(new MangaByNameComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------------- Sorted by price ----------------");
        mangas.sort(new MangaByPriceComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
