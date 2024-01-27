package studies.maratonajava.introducao;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        double wage = 70000;
        boolean isTaxesOne = wage >= 0 && wage <= 34712;
        boolean isTaxesTwo = wage >= 34713 && wage <= 68507;
        boolean isTaxesThree = wage >= 68508;
        double taxesResult = 0.00;

        if (isTaxesOne) {
            taxesResult = wage * (9.70 / 100);
        }

        if (isTaxesTwo) {
            taxesResult = wage * (37.35 / 100);
        }

        if (isTaxesThree) {
            taxesResult = wage * (49.50 / 100);
        }

        System.out.println(taxesResult);

    }
}
