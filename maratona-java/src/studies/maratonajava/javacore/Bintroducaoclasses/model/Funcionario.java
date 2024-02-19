package studies.maratonajava.javacore.Bintroducaoclasses.model;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (salarios == null) return;

        System.out.print("Salários: ");

        for (double salario : salarios) {
            System.out.print(salario + " ");
        }

        System.out.println();
        mediaSalarios();
    }

    public void mediaSalarios() {
        if (salarios == null) return;

        double soma = 0;

        for (double num : this.salarios) {
            soma += num;
        }

        System.out.println("Media salarial: " + soma / this.salarios.length);
    }
}
