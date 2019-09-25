package Elements;
import java.util.ArrayList;
import java.util.Random;

public class Jogada {
    private static int contJogadas;
    private ArrayList<Integer> listaPontos;
    
    public Jogada(){
        contJogadas = 0;
        this.listaPontos = new ArrayList();
    }
    
    public int lancarDado(){
        Random random = new Random();
        int valor = random.nextInt(6);
        return valor;
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
        int dado1 = lancarDado();
        int dado2 = lancarDado();
        int soma = dado1 + dado2;
        
        this.listaPontos.add(soma);
        if(ponto == soma){
            return true;
        }
        
        if(soma == 7){
            return false;
        }
        
        return verificaJogada(ponto);
    }
    
    public int[] listaJogadas(){
        int lenthListPontos = this.listaPontos.size();
        int[] jogadas = new int[lenthListPontos];
        jogadas = this.listaPontos.toArray(jogadas);

        return jogadas;
    }
    
    public int getContJogadas(){
        return Jogada.contJogadas;
    }
    public void setContJogadas(){
        Jogada.contJogadas = 0;
    }
    
}
