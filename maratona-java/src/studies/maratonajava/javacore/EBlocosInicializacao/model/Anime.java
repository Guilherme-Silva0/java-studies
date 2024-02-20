package studies.maratonajava.javacore.EBlocosInicializacao.model;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        this.episodios = new int[100];

        for (int i = 0; i < this.episodios.length; i++) {
            this.episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios) {
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
