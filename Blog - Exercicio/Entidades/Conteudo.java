package Entidades;
import java.util.Date;

public class Conteudo {
    private Date dataCriacao;
    private String mensagem;
    private Usuario autor;
    private Blog blogAssociado;

    public Conteudo(String mensagem, Usuario autor){
        this.mensagem = mensagem;
        this.dataCriacao = new Date();
        this.autor = autor;
        autor.associarConteudo(this);
    }

    public String getMensagem() {
        return mensagem;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Usuario getAutor(){
        return autor;
    }

    public void associarBlog(Blog blog){
        this.blogAssociado = blog;
    }
}

