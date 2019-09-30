package Elements;

import java.util.ArrayList;

public class Jogada {
    private static int contJogadas;
    private ArrayList<Integer> listaPontos;
    
    public Jogada(){
        contJogadas = 0;
        this.listaPontos = new ArrayList();
    }
    
    public boolean verificaJogada(int ponto){
        Jogada.contJogadas++;
        if(contJogadas == 1){
            if(ponto == 7 || ponto == 11){
                return true;
            }
            if(ponto == 2 || ponto == 3 || ponto == 12){
                return false;
            }
        }
        int dado1 = Dado.lancarDado();
        int dado2 = Dado.lancarDado();
        int soma = dado1 + dado2;

        System.out.println("Pontos: " + soma);
        this.listaPontos.add(soma);
        if(ponto == soma){
            return true;
        }
        
        if(soma == 7){
            return false;
        }
        
        return verificaJogada(ponto);
    }
    
    public Integer[] listaJogadas(){
        Integer[] pontos = new Integer[this.listaPontos.size()];
        pontos = this.listaPontos.toArray(pontos);

        return pontos;
    }
    
    public int getContJogadas(){
        return Jogada.contJogadas;
    }
    public void setContJogadas(){
        Jogada.contJogadas = 0;
    }
    
}
