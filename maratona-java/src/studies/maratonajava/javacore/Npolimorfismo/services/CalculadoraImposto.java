package studies.maratonajava.javacore.Npolimorfismo.services;

import studies.maratonajava.javacore.Npolimorfismo.model.Produto;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImpost();
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Valor sem imposto: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        System.out.println("Valor total com imposto: " + (produto.getValor() + imposto));
    }
}
