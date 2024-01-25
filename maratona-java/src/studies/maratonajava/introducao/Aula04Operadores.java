package studies.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *

        // O resulto da divisão entre dois números inteiros é sempre um numero inteiro.

        int num1 = 10;
        int num2 = 20;

        System.out.println("Soma: " + ( num1 + num2 ));
        System.out.println("Subtração: " + ( num1 - num2 ));
        System.out.println("Multiplicação: " + ( num1 * num2 ));
        System.out.println("Divisão: " + ( num1 / (double) num2 ));

        System.out.println("\n");
        // %

        int rest = 20 % 7;

        System.out.println("Resto da divisão: " + rest);

        System.out.println("\n");
        // < > <= >= == !=
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualToTwenty = 10 == 20.0;
        boolean isTenDifferentFromTwenty = 10 != 20.0;

        System.out.println("10 é maior que 20? "+isTenGreaterThanTwenty);
        System.out.println("10 é menor que 20? "+isTenLessThanTwenty);
        System.out.println("10 é igual a 20? "+isTenEqualToTwenty);
        System.out.println("10 é diferente de 20? "+isTenDifferentFromTwenty);
    }
}
