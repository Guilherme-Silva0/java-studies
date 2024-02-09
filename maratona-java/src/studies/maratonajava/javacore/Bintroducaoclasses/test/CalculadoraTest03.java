package studies.maratonajava.javacore.Bintroducaoclasses.test;

import studies.maratonajava.javacore.Bintroducaoclasses.model.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(14, 2);
        System.out.println(result);
        System.out.println("-------------------------");
        System.out.println(calculadora.dvideDoisNumeros02(20, 0));
        System.out.println("-------------------------");
        calculadora.imprimeDivisaoDoisNumeros(20, 5);
    }
}
