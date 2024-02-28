package studies.maratonajava.javacore.Gassociacao.test;

import studies.maratonajava.javacore.Gassociacao.model.Jogador;
import studies.maratonajava.javacore.Gassociacao.model.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
