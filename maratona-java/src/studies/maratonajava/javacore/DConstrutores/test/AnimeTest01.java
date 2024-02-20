package studies.maratonajava.javacore.DConstrutores.test;

import studies.maratonajava.javacore.DConstrutores.model.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", "TV", 1102, "Ação");
        Anime anime1 = new Anime();
        anime.imprimir();
        anime1.imprimir();
    }
}
