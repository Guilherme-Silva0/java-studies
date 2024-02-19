package studies.maratonajava.javacore.Bintroducaoclasses.test;

import studies.maratonajava.javacore.Bintroducaoclasses.model.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {2, 3, 4, 54, 65};

        calculadora.somaArray(numeros);

        calculadora.somaVarArgs(1, 2, 3, 43, 45, 2, 234);
    }
}
