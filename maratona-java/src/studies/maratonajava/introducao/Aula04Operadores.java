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

        System.out.println("\n");
        // && (AND), || (OR), ! (NOT)

        int age = 24;
        float wage = 3500f;
        boolean isWithinTheLawGreaterThanThirty = age >= 30 && wage >= 4612;
        boolean isWithinTheLawLessThanThirty = age < 30 && wage >= 3381;

        System.out.println("Esta na lei maior que 30? " + isWithinTheLawGreaterThanThirty);
        System.out.println("Esta na lei manor que 30? "+isWithinTheLawLessThanThirty);

        double currentValue = 500;
        double savingsValue = 10000;

        boolean isPurchasable = currentValue >= 5000 || savingsValue >= 5000;
        System.out.println("É possível comprar um PS5? " + isPurchasable);
    }
}
