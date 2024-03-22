package studies.maratonajava.javacore.Lclassesabstratas.test;

import studies.maratonajava.javacore.Lclassesabstratas.model.Desenvolvedor;
import studies.maratonajava.javacore.Lclassesabstratas.model.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Luffy", 1100);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Guilherme", 9000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
