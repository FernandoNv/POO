package Dicionario;

import java.util.ArrayList;
import java.util.List;


public class Palavra {
    private String palavra;
    private String colocacao;
    private List<Synset> listaVerbo;
    private List<Synset> listaSubstantivo;
    private List<Synset> listaAdjetivo;
    private List<Synset> listaAdverbio;
    public Palavra(String palavra, String colocacao, Synset tipo){
        this.palavra = palavra;
        this.colocacao = colocacao;
        this.listaSubstantivo = new ArrayList<Synset>();
        this.listaSubstantivo = new ArrayList<Synset>();
        this.listaAdverbio = new ArrayList<Synset>();
        this.listaVerbo = new ArrayList<Synset>();
    }   

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public void setColocacao(String colocacao) {
        this.colocacao = colocacao;
    }

    public String getPalavra() {
        return palavra;
    }

    public String getColocacao() {
        return colocacao;
    }
    
    
}
