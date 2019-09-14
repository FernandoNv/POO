package Entidades;
import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private ArrayList<Conteudo> listaConteudo;
    private ArrayList<Blog> listaBlog;

    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
        this.listaConteudo = new ArrayList<Conteudo>();
        this.listaBlog = new ArrayList<Blog>();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void associarConteudo(Conteudo conteudo){
        this.listaConteudo.add(conteudo);
    }

    public void associarBlog(Blog blog){
        this.listaBlog.add(blog);
    }
}
