package studies.maratonajava.introducao;

public class Aula05EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        // Utilizando Switch dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considere 1 como domingo
        byte day = 4;

        switch (day) {
            case 1:
                System.out.println("Final de semana (Domingo)");
                break;
            case 2:
                System.out.println("Dia útil (Segunda)");
                break;
            case 3:
                System.out.println("Dia útil (Terça)");
                break;
            case 4:
                System.out.println("Dia útil (Quarta)");
                break;
            case 5:
                System.out.println("Dia útil (Quinta)");
                break;
            case 6:
                System.out.println("Dia útil (Sexta)");
                break;
            case 7:
                System.out.println("Final de semana (Sábado)");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
