package studies.maratonajava.javacore.Ycolections.test;

import studies.maratonajava.javacore.Ycolections.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> queue = new PriorityQueue<>(new MangaByPriceComparator().reversed());
        queue.add(new Manga(5L, "Berserk", 19.99, 0));
        queue.add(new Manga(2L, "Hellsing Ultimate", 23.99, 5));
        queue.add(new Manga(4L, "Attack on Titan", 25.99, 0));
        queue.add(new Manga(1L, "Pokemon", 21.99, 2));
        queue.add(new Manga(3L, "Dragon Ball Z", 15.99, 0));
        queue.add(new Manga(3L, "Dragon Ball Z", 15.99, 0));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
