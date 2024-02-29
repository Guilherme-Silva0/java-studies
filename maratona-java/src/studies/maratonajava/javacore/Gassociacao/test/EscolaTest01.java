package studies.maratonajava.javacore.Gassociacao.test;

import studies.maratonajava.javacore.Gassociacao.model.Escola;
import studies.maratonajava.javacore.Gassociacao.model.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Roberto");
        Professor professor2 = new Professor("Fernanda");
        Professor professor3 = new Professor("Alexa");
        Professor professor4 = new Professor("Pedro");
        Escola escola = new Escola("Salaberga", new Professor[]{professor1, professor2, professor3, professor4});

        escola.imprime();
    }
}
