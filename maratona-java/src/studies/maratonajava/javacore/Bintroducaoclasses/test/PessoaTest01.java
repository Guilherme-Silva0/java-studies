package studies.maratonajava.javacore.Bintroducaoclasses.test;

import studies.maratonajava.javacore.Bintroducaoclasses.model.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Guilherme");
        pessoa.setIdade(19);

        //pessoa.imprimir();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
