package Entidades;
import java.util.ArrayList;

public class Nota extends Conteudo{
    private ArrayList<Comentario> listaComentarios;

    public Nota(String mensagem, Usuario autor){
        super(mensagem, autor);
    }
    public void comentar(Comentario comentario){
        this.listaComentarios.add(comentario);
    }

    public Comentario[] lerComentarios(){
        int lenthListComments = this.listaComentarios.size();
        Comentario[] comentarios = new Comentario[lenthListComments];
        comentarios = this.listaComentarios.toArray(comentarios);

        return comentarios;
    }

}
