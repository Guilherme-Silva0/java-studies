package studies.maratonajava.javacore.Bintroducaoclasses.test;

import studies.maratonajava.javacore.Bintroducaoclasses.model.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Alexandre");
        funcionario.setIdade(28);
        funcionario.setSalarios(new double[]{2345.5, 3342.2, 1897.5});
        
        funcionario.imprimir();
    }
}
