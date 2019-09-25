package jogo.de.dados;
import Elements.Jogador;
import Elements.Jogada;

public class JogoDeDados {
    public static void main(String[] args) {
        Jogada lancador = new Jogada();
        Jogador jogador = new Jogador();
        int pontos;
        pontos = lancador.lancarDado() + lancador.lancarDado();
        jogador.setPontos(pontos);
        System.out.println("Pontos " + pontos);
        boolean venceu = lancador.verificaJogada(pontos);
        
        if(venceu){
            System.out.println("Venceu");
        }else{
            System.out.println("Perdeu");
        }
    }
    
}
