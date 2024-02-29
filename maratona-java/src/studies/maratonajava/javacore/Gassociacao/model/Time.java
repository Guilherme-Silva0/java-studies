package studies.maratonajava.javacore.Gassociacao.model;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);

        if (jogadores == null) return;

        System.out.print("Jogadores: ");
        for (int i = 0; i < this.jogadores.length; i++) {
            System.out.print(this.jogadores[i].getNome() + ((this.jogadores.length - 2 == i) ? " e " : (this.jogadores.length - 1) > i ? ", " : "."));
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
