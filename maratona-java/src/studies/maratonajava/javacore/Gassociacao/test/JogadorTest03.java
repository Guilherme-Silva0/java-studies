package studies.maratonajava.javacore.Gassociacao.test;

import studies.maratonajava.javacore.Gassociacao.model.Jogador;
import studies.maratonajava.javacore.Gassociacao.model.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafú");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil", new Jogador[]{jogador, jogador2});

        jogador.setTime(time);
        jogador2.setTime(time);

        System.out.println("--- Jogador ---");
        jogador.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
