package Elements;

public class Main {
    public static void main(String[] args) {
        Jogada lancador = new Jogada();
        Jogador jogador = new Jogador();
        int pontos;
        pontos = Dado.lancarDado() + Dado.lancarDado();
        jogador.setPontos(pontos);
        System.out.println("Pontos: " + pontos);
        boolean venceu = lancador.verificaJogada(pontos);

        if(venceu){
            System.out.println("Venceu");
        }else{
            System.out.println("Perdeu");
        }
    }
}
