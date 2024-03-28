package studies.maratonajava.javacore.Npolimorfismo.model;

public class Computador extends Produto {
    public static final double PORCENTAGEM_IMPOSTO = 0.20;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImpost() {
        System.out.println("Calculando imposto do computador...");
        return valor * PORCENTAGEM_IMPOSTO;
    }
}
