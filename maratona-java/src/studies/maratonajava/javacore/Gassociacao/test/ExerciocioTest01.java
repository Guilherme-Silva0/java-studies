package studies.maratonajava.javacore.Gassociacao.test;

import studies.maratonajava.javacore.Gassociacao.exercicio.Estudante;
import studies.maratonajava.javacore.Gassociacao.exercicio.Local;
import studies.maratonajava.javacore.Gassociacao.exercicio.Professor;
import studies.maratonajava.javacore.Gassociacao.exercicio.Seminario;

public class ExerciocioTest01 {
    public static void main(String[] args) {
        Local local1 = new Local("Rua das flores");
        Local local2 = new Local("Rua das flores");

        Estudante estudante1 = new Estudante("Pedro", 16);
        Estudante estudante2 = new Estudante("Jessica", 16);
        Estudante estudante3 = new Estudante("Guilherme", 16);
        Estudante estudante4 = new Estudante("Amanda", 16);

        Seminario seminario1 = new Seminario("Porque ser um programador.", local1, new Estudante[]{estudante1, estudante2});
        Seminario seminario2 = new Seminario("Qual área da programação devo seguir.", local2, new Estudante[]{estudante3, estudante4});

        Professor professor = new Professor("Rafael", "Historia", new Seminario[]{seminario1, seminario2});

        estudante1.setSeminario(seminario1);
        estudante2.setSeminario(seminario1);
        estudante3.setSeminario(seminario2);
        estudante4.setSeminario(seminario2);

        professor.imprime();
    }
}
