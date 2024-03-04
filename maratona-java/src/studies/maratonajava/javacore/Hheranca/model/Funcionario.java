package studies.maratonajava.javacore.Hheranca.model;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático do funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático 1 do funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático 2 do funcionario");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do contrutor de funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Eu, " + this.nome + ", recebi o salário de " + this.salario + " reais");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
