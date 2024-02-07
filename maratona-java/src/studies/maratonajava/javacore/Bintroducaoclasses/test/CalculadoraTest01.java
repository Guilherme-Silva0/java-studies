package studies.maratonajava.javacore.Bintroducaoclasses.test;

import studies.maratonajava.javacore.Bintroducaoclasses.model.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();

        System.out.println("Finalizando calculadora teste 01");
    }
}
