package Entidades;

public class Comentario extends Conteudo{
    private Nota nota;

    public Comentario(String mensagem, Usuario autor){
        super(mensagem, autor);
    }
    public void associarNota(Nota nota){
        this.nota = nota;
    }
}
