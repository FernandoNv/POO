package Entidades;
import java.util.ArrayList;
import java.util.Date;

public class Blog {
    private String titulo;
    private Date dataCriacao;
    private Usuario dono;
    private ArrayList<Nota> listaNota;
    private ArrayList<Conteudo> listaConteudo;

    public Blog(String titulo, Usuario usuario){
        this.titulo = titulo;
        this.dataCriacao = new Date();
        this.listaNota = new ArrayList<Nota>();
        this.listaConteudo = new ArrayList<Conteudo>();
        this.dono = usuario;
        this.dono.associarBlog(this);

    }

    public String getTitulo() {
        return titulo;
    }

    public Usuario getDono() {
        return dono;
    }

    public void comentar(Comentario comentario, Nota nota){
        boolean resp = this.listaNota.contains(nota);
        if(resp) nota.comentar(comentario);
    }

    public void criarNota(Nota nota){
        this.listaNota.add(nota);
    }

    public Conteudo[] lerConteudo(){
        int lengthArrayListConteudo = this.listaConteudo.size();
        Conteudo[] conteudos = new Conteudo[lengthArrayListConteudo];
        conteudos = this.listaConteudo.toArray(conteudos);

        return conteudos;
    }

    public Conteudo[] lerNotas(){
        int lengthArrayListNota = this.listaNota.size();
        Nota[] notas = new Nota[lengthArrayListNota];
        notas = this.listaNota.toArray(notas);

        return notas;
    }

    public void removerConteudo(Conteudo conteudo){
        listaConteudo.remove(conteudo);
    }
}
