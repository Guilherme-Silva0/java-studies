package studies.maratonajava.javacore.Npolimorfismo.model;

public class Tomate extends Produto {
    public static final double PORCENTAGEM_IMPOSTO = 0.15;
    private String dataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImpost() {
        System.out.println("Calculando imposto do tomate...");
        return valor * PORCENTAGEM_IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
