package studies.maratonajava.javacore.Aintroducaoclasses.test;

import studies.maratonajava.javacore.Aintroducaoclasses.model.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Pedro";
        estudante.idade = 16;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
