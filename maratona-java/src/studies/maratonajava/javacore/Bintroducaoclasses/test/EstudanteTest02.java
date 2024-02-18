package studies.maratonajava.javacore.Bintroducaoclasses.test;

import studies.maratonajava.javacore.Bintroducaoclasses.model.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();

        estudante01.nome = "Guilherme";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante01.imprime();

        Estudante estudante02 = new Estudante();

        estudante02.nome = "Geovana";
        estudante02.idade = 18;
        estudante02.sexo = 'F';

        estudante02.imprime();
    }
}
