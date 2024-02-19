package studies.maratonajava.javacore.CSobrecargaMetodos.test;

import studies.maratonajava.javacore.CSobrecargaMetodos.model.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("One Piece", "TV", 1102);
        anime.init("One Piece", "TV", 1102, "Ação");

        anime.imprimir();
    }
}
