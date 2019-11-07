import java.util.ArrayList;
import java.util.List;

public class Palavra {
    private String palavra;
    private String colocacao;
    private List<Verbo> listaVerbo = new ArrayList();
    private List<Substantivo> listaSubstantivo = new ArrayList();
    private List<Adjetivo> listaAdjetivo = new ArrayList();
    private List<Adverbio> listaAdverbio = new ArrayList();

    Palavra(String palavra, String colocacao, Substantivo tipo) {
        this.palavra = palavra;
        this.colocacao = colocacao;
        this.listaSubstantivo.add(tipo);
        tipo.addPalavra(this);
    }

    Palavra(String palavra, String colocacao, Adjetivo tipo) {
        this.palavra = palavra;
        this.colocacao = colocacao;
        this.listaAdjetivo.add(tipo);
        tipo.addPalavra(this);
    }

    Palavra(String palavra, String colocacao, Verbo tipo) {
        this.palavra = palavra;
        this.colocacao = colocacao;
        this.listaVerbo.add(tipo);
        tipo.addPalavra(this);
    }

    Palavra(String palavra, String colocacao, Adverbio tipo) {
        this.palavra = palavra;
        this.colocacao = colocacao;
        this.listaAdverbio.add(tipo);
        tipo.addPalavra(this);
    }

    private void addSynset(Adverbio tipo) {
        this.listaAdverbio.add(tipo);
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public void setColocacao(String colocacao) {
        this.colocacao = colocacao;
    }

    String getPalavra() {
        return this.palavra;
    }

    String getColocacao() {
        return this.colocacao;
    }

    public List<Verbo> getListaVerbo() {
        return this.listaVerbo;
    }

    public List<Substantivo> getListaSubstantivo() {
        return this.listaSubstantivo;
    }

    public List<Adjetivo> getListaAdjetivo() {
        return this.listaAdjetivo;
    }

    public List<Adverbio> getListaAdverbio() {
        return this.listaAdverbio;
    }
}