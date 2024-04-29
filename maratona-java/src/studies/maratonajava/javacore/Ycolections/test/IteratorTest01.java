package studies.maratonajava.javacore.Ycolections.test;

import studies.maratonajava.javacore.Ycolections.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Berserk", 19.99, 0));
        mangas.add(new Manga(2L, "Hellsing Ultimate", 23.99, 5));
        mangas.add(new Manga(4L, "Attack on Titan", 25.99, 0));
        mangas.add(new Manga(1L, "Pokemon", 21.99, 2));
        mangas.add(new Manga(3L, "Dragon Ball Z", 15.99, 0));

        Iterator<Manga> mangaIterator = mangas.iterator();

//        while (mangaIterator.hasNext()) {
//            if (mangaIterator.next().getQuantity() == 0) {
//                mangaIterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantity() == 0);
        System.out.println(mangas);
    }
}
