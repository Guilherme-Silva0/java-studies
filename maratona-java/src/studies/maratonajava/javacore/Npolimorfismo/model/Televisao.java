package studies.maratonajava.javacore.Npolimorfismo.model;

public class Televisao extends Produto {
    public static final double PORCENTAGEM_IMPOSTO = 0.15;
    
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImpost() {
        System.out.println("Calculando imposto da televisão...");
        return valor * PORCENTAGEM_IMPOSTO;
    }
}
