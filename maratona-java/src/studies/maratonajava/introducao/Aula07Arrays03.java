package studies.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] numbers2 = {1, 2, 3, 4, 5};
        int[] numbers3 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers3[i]);
        }

        System.out.println("\n");

        for (int num:numbers2) {
            System.out.println(num);
        }
    }
}
