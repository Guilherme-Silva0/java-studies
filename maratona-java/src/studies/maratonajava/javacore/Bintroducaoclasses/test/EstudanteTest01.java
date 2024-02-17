package studies.maratonajava.javacore.Bintroducaoclasses.test;

import studies.maratonajava.javacore.Bintroducaoclasses.model.Estudante;
import studies.maratonajava.javacore.Bintroducaoclasses.model.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Geovana";
        estudante01.idade = 18;
        estudante01.sexo = 'F';

        estudante02.nome = "Guilherme";
        estudante02.idade = 19;
        estudante02.sexo = 'M';

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

        System.out.println("###################");

        impressora.imprime(estudante01);
        
        impressora.imprime(estudante02);
    }
}
