package studies.maratonajava.javacore.Bintroducaoclasses.model;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 11);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double dvideDoisNumeros02(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }

        return 0;
    }

    public void imprimeDivisaoDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por 0!");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int numero1, int numero02) {
        numero1 = 99;
        numero02 = 43;


        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: " + numero1);
        System.out.println("Num2: " + numero02);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        System.out.println(soma);
    }

}
