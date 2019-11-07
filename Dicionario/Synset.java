import java.util.HashMap;
import java.util.Map;

public abstract class Synset {
    private String significado;
    private Map<String, Palavra> mapaPalavras = new HashMap();

    Synset(String significado) {
        this.significado = significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public void setMapaPalavras(Map<String, Palavra> mapaPalavras) {
        this.mapaPalavras = mapaPalavras;
    }

    String getSignificado() {
        return this.significado;
    }

    Map<String, Palavra> getMapaPalavras() {
        return this.mapaPalavras;
    }

    void addPalavra(Palavra palavra) {
        this.mapaPalavras.put(palavra.getPalavra(), palavra);
    }
}
