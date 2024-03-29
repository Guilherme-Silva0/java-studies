package studies.maratonajava.javacore.Kenum.model;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int VALOR;
    private final String RELATORIO;

    TipoCliente(int valor, String relatorio) {
        this.VALOR = valor;
        this.RELATORIO = relatorio;
    }

    public static TipoCliente tipoClientePorAtributo(String atributo) {
        for (TipoCliente value : values()) {
            if (value.getRelatorio().equals(atributo)) {
                return value;
            }
        }
        return null;
    }

    public int getValor() {
        return VALOR;
    }

    public String getRelatorio() {
        return RELATORIO;
    }
}
