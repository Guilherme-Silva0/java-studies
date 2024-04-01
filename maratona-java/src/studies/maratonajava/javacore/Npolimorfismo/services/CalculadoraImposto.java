package studies.maratonajava.javacore.Npolimorfismo.services;

import studies.maratonajava.javacore.Npolimorfismo.model.Produto;
import studies.maratonajava.javacore.Npolimorfismo.model.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImpost();
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Valor sem imposto: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        System.out.println("Valor total com imposto: " + (produto.getValor() + imposto));
        if (produto instanceof Tomate && ((Tomate) produto).getDataValidade() != null) {
            System.out.println("Data de validade: " + ((Tomate) produto).getDataValidade());
        }
    }
}
