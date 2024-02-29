package studies.maratonajava.javacore.Gassociacao.model;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime() {
        System.out.println("Nome da escola: " + this.nome);

        if (this.professores == null) return;

        System.out.print("Professores: ");

        for (int i = 0; i < this.professores.length; i++) {
            System.out.print(this.professores[i].getNome() + ((this.professores.length - 2 == i) ? " e " : (this.professores.length - 1) > i ? ", " : "."));
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
