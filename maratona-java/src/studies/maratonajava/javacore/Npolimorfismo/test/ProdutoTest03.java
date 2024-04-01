package studies.maratonajava.javacore.Npolimorfismo.test;

import studies.maratonajava.javacore.Npolimorfismo.model.Computador;
import studies.maratonajava.javacore.Npolimorfismo.model.Produto;
import studies.maratonajava.javacore.Npolimorfismo.model.Tomate;
import studies.maratonajava.javacore.Npolimorfismo.services.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3500);
        Tomate tomate = new Tomate("Tomate Amarelo", 9);
        tomate.setDataValidade("22/04/2024");
        Tomate tomate2 = new Tomate("Tomate Vermelho", 8);

        CalculadoraImposto.calcularImposto(produto);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(tomate2);
    }
}
