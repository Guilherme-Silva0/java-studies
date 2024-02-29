package studies.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTeclas01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String nome = input.next().trim();
        System.out.print("Qual sua idade? ");
        int idade = input.nextInt();
        System.out.print("Qual seu sexo? (M para masculio, F para feminino ou N para não especificado) ");
        char sexo = input.next().toUpperCase().trim().charAt(0);
        
        String sexoFormatado = sexo != 'M' ? sexo != 'F' ? "Não especificado" : "Feminino" : "Masculino";

        System.out.println("Wow, belo nome " + nome + ", vocẽ tem " + idade + " anos, e seu sexo é " + sexoFormatado);
    }
}
