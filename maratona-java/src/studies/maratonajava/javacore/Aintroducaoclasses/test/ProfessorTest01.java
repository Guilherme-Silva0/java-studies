package studies.maratonajava.javacore.Aintroducaoclasses.test;

import studies.maratonajava.javacore.Aintroducaoclasses.model.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Guilherme";
        professor.idade = 19;
        professor.sexo = 'M';

        System.out.println(professor.nome + ", " + professor.idade + ", Anos " + professor.sexo);
    }
}
