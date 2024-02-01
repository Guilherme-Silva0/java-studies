package studies.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04Exercicio {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Valor minimo da parcela é de 1000
    public static void main(String[] args) {
        double value = 40000;
        for (int part = 1; part <= value; part++) {
            double partValue = value / part;
            if (partValue < 1000) break;
            System.out.println(part + " Vezes de R$" + partValue);
        }
    }
}
