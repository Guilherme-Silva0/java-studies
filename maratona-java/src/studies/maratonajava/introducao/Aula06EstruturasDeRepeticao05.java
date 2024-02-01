package studies.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double value = 40000;
        for (int part = (int) value; part >= 1; part--) {
            double partValue = value / part;
            if (partValue < 1000) continue;
            System.out.println(part + " Vezes de R$" + partValue);
        }
    }
}
