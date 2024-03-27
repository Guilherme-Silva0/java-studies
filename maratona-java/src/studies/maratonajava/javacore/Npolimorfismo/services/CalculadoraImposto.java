package studies.maratonajava.javacore.Npolimorfismo.services;

import studies.maratonajava.javacore.Npolimorfismo.model.Computador;
import studies.maratonajava.javacore.Npolimorfismo.model.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostComputador(Computador computador) {
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImpost();
        System.out.println("Computador " + computador.getNome());
        System.out.println("Valor sem imposto " + computador.getValor());
        System.out.println("Imposto a ser pago " + imposto);
        System.out.println("Valor total com imposto " + (computador.getValor() + imposto));
    }

    public static void calcularImpostTomate(Tomate tomate) {
        System.out.println("Relatório de imposto do tomate");
        double imposto = tomate.calcularImpost();
        System.out.println("Tomate " + tomate.getNome());
        System.out.println("Valor sem imposto " + tomate.getValor());
        System.out.println("Imposto a ser pago " + imposto);
        System.out.println("Valor total com imposto " + (tomate.getValor() + imposto));
    }
}
