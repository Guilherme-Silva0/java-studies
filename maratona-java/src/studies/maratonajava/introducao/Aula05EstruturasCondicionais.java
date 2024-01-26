package studies.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int age = 20;
        boolean isOfLegalAge = age >= 18;

        if (isOfLegalAge) {
            System.out.println("Is authorized");
        }

        if (!isOfLegalAge) {
            System.out.println("Not authorized");
        }

        System.out.println("Thanks!");
    }
}
