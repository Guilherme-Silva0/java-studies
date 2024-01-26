package studies.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 20;
        boolean isOfLegalAge = age >= 18;

        if (isOfLegalAge) {
            System.out.println("Is authorized");
        } else {
            System.out.println("Not authorized");
        }

        if (!isOfLegalAge) {
            System.out.println("Is Minor");
        }

        System.out.println("Thanks!");
    }
}
