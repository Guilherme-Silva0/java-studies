package studies.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int age = 17;

        if (age < 15) {
            System.out.println("Children's category");
        } else if (age >= 15 && age < 18) {
            System.out.println("Youth category");
        } else {
            System.out.println("Adult category");
        }
    }
}
