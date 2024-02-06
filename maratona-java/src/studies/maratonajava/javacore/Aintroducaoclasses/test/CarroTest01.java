package studies.maratonajava.javacore.Aintroducaoclasses.test;

import studies.maratonajava.javacore.Aintroducaoclasses.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.nome = "Volkswagen";
        carro01.modelo = "Fusca";
        carro01.ano = 2000;

        Carro carro02 = new Carro();
        carro02.nome = "Fiat";
        carro02.modelo = "Palio";
        carro02.ano = 2010;

        carro01 = carro02;

        System.out.println(carro01.nome + " " + carro01.ano + " " + carro01.modelo);
        System.out.println(carro02.nome + " " + carro02.ano + " " + carro02.modelo);
    }
}
