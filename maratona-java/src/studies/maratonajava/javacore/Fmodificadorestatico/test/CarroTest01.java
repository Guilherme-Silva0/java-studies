package studies.maratonajava.javacore.Fmodificadorestatico.test;

import studies.maratonajava.javacore.Fmodificadorestatico.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(290);

        System.out.println("-----------------");
        System.out.println("Velocidade limite geral: " + Carro.getVelocidadeLimite());
        System.out.println("-----------------");

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
