package studies.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{1, 2};
        arrayInt[1] = new int[]{3, 4, 5};
        arrayInt[2] = new int[]{6, 7, 8, 9};

        StringBuilder text = new StringBuilder();
        for (int[] arrayBase : arrayInt) {
            text.append("\n").append("-----------------").append("\n");
            for (int num : arrayBase) {
                text.append(num).append(" ");
            }
        }
        System.out.println(text);
        System.out.println("-----------------" + "\n");

        int[][] arrayInt2 = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};

        StringBuilder text2 = new StringBuilder();
        for (int[] arrayBase : arrayInt2) {
            text2.append("\n").append("-----------------").append("\n");
            for (int num : arrayBase) {
                text2.append(num).append(" ");
            }
        }
        System.out.println(text2);
        System.out.println("-----------------");
    }
}
