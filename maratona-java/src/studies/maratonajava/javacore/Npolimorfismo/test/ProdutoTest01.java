package studies.maratonajava.javacore.Npolimorfismo.test;

import studies.maratonajava.javacore.Npolimorfismo.model.Computador;
import studies.maratonajava.javacore.Npolimorfismo.model.Tomate;
import studies.maratonajava.javacore.Npolimorfismo.services.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 11000);
        Tomate tomate = new Tomate("Verde", 10);

        CalculadoraImposto.calcularImpostComputador(computador);
        System.out.println();
        System.out.println("-----------------------------------------------");
        System.out.println();
        CalculadoraImposto.calcularImpostTomate(tomate);
    }
}
