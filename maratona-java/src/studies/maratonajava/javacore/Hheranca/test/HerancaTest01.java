package studies.maratonajava.javacore.Hheranca.test;

import studies.maratonajava.javacore.Hheranca.model.Endereco;
import studies.maratonajava.javacore.Hheranca.model.Funcionario;
import studies.maratonajava.javacore.Hheranca.model.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das flores");
        endereco.setCep("12345-678");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Amanda");
        pessoa.setCpf("000.000.000-00");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Pedro");
        funcionario.setCpf("000.000.000-00");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500);

        funcionario.imprime();
    }
}
