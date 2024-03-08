package studies.maratonajava.javacore.Jmodificadorfinal.test;

import studies.maratonajava.javacore.Jmodificadorfinal.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setNome("Vectar");
        System.out.println(Carro.VELOCIDADE_LIMITE + " " + carro.getNome());
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Guilherme");
        System.out.println(carro.COMPRADOR);
    }
}
