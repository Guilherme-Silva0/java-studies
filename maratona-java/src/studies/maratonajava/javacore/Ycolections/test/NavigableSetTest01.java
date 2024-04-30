package studies.maratonajava.javacore.Ycolections.test;

import studies.maratonajava.javacore.Ycolections.domain.Manga;
import studies.maratonajava.javacore.Ycolections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneBrandComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone smartphone1, Smartphone smartphone2) {
        return smartphone1.getBrand().compareTo(smartphone2.getBrand());
    }
}

class MangaPriceComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getPrice().compareTo(manga2.getPrice());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneBrandComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaByPriceComparator());
        mangas.add(new Manga(5L, "Berserk", 19.99, 0));
        mangas.add(new Manga(2L, "Hellsing Ultimate", 23.99, 5));
        mangas.add(new Manga(4L, "Attack on Titan", 25.99, 0));
        mangas.add(new Manga(1L, "Pokemon", 21.99, 2));
        mangas.add(new Manga(3L, "Dragon Ball Z", 15.99, 0));
        mangas.add(new Manga(3L, "Dragon Ball Z", 15.99, 0));

        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }

        System.out.println("----------------------------");

        Manga yuyu = new Manga(6L, "Yuyu Hakusho", 19.99, 5);
        // lower <
        System.out.println(mangas.lower(yuyu));
        // floor <=
        System.out.println(mangas.floor(yuyu));
        // higher >
        System.out.println(mangas.higher(yuyu));
        // ceiling >=
        System.out.println(mangas.ceiling(yuyu));

        System.out.println("-------------------------");
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());
    }
}
