package studies.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima um dia da semana, considerando 1 domingo
        byte day = 1;
        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        char sex = 'M';
        switch (sex) {
            case 'M':
                System.out.println("Mulher");
                break;
            case 'H':
                System.out.println("Homem");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
