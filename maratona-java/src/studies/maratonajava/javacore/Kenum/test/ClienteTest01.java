package studies.maratonajava.javacore.Kenum.test;

import studies.maratonajava.javacore.Kenum.model.Cliente;
import studies.maratonajava.javacore.Kenum.model.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Amanda", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente02 = new Cliente("Pedro", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
    }
}
