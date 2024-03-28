package studies.maratonajava.javacore.Npolimorfismo.test;

import studies.maratonajava.javacore.Npolimorfismo.model.Computador;
import studies.maratonajava.javacore.Npolimorfismo.model.Produto;
import studies.maratonajava.javacore.Npolimorfismo.model.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3500);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImpost());
        System.out.println("-----------------------------");
        Produto produto2 = new Tomate("Amarelo", 8);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImpost());
    }
}
