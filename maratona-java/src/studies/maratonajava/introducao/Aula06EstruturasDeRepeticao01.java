package studies.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;

        System.out.println("While");

        while (count <= 10) {
            System.out.println(count++);
        }

        System.out.println("\nDo While");
        count = 0;

        do {
            System.out.println(count++);
        } while (count <= 10);

        System.out.println("\nFor");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
