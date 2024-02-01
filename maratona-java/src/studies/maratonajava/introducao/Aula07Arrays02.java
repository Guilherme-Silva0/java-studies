package studies.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Byte, short, int, long, float, e double 0
        // char '\u0000'
        // boolean false
        // String null

        String[] names = new String[3];
        names[0] = "Maria";
        names[1] = "Julia";
        names[2] = "João";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
