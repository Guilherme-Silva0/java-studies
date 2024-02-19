package studies.maratonajava.javacore.Bintroducaoclasses.model;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (salarios == null) return;

        System.out.print("Salários: ");

        for (double salario : this.salarios) {
            System.out.print(salario + " ");
        }

        System.out.println();
        mediaSalarios();
    }

    public void mediaSalarios() {
        if (salarios == null) return;

        for (double num : this.salarios) {
            this.media += num;
        }

        this.media /= this.salarios.length;

        System.out.println("Media salarial: " + this.media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
