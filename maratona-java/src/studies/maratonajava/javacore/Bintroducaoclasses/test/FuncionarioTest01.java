package studies.maratonajava.javacore.Bintroducaoclasses.test;

import studies.maratonajava.javacore.Bintroducaoclasses.model.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Alexandre";
        funcionario.idade = 28;
        funcionario.salarios = new double[]{2345.5, 3342.2, 1897.5};

        funcionario.imprimir();
    }
}
