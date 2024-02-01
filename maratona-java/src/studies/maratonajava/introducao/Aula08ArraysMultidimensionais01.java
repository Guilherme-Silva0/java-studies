package studies.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        int[][] days = new int[3][3];
        days[0][0] = 1;
        days[0][1] = 2;
        days[0][2] = 3;

        days[1][0] = 4;
        days[1][1] = 5;
        days[1][2] = 6;

        days[2][0] = 7;
        days[2][1] = 8;
        days[2][2] = 9;

        StringBuilder daysString = new StringBuilder();
        for (int i = 0; i < days.length; i++) {
            for (int j=0; j<days[i].length;j++) {
                daysString.append(days[i][j]).append(" ");
            }
        }
        System.out.println(daysString);
    }
}
