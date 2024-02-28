package studies.maratonajava.javacore.Fmodificadorestatico.model;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicialização estico 1");
        Anime.episodios = new int[100];

        for (int i = 0; i < Anime.episodios.length; i++) {
            Anime.episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estico 2");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estico");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }

        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
