package studies.maratonajava.javacore.Kenum.test;

import studies.maratonajava.javacore.Kenum.model.Cliente;
import studies.maratonajava.javacore.Kenum.model.TipoCliente;
import studies.maratonajava.javacore.Kenum.model.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Amanda", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente02 = new Cliente("Pedro", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoCliente.tipoClientePorAtributo("Pessoa Jurídica"));
    }
}
