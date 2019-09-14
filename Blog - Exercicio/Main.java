import Entidades.Blog;
import Entidades.Conteudo;
import Entidades.Nota;
import Entidades.Usuario;

public class Main {
    public static void main(String[] args){
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        */
        Usuario fernando = new Usuario("Fernando do Nascimento", "email@email.com");
        Blog myBlog = new Blog("Meu Blog", fernando);

        Nota post1 = new Nota("Meu primeiro texto. Parece estar funcionando.", fernando);
        Nota post2 = new Nota("Meu segundo texto. Parece estar funcionando.", fernando);
        Nota post3 = new Nota("Meu terceiro texto. Parece estar funcionando.", fernando);

        myBlog.criarNota(post1);
        myBlog.criarNota(post2);
        myBlog.criarNota(post3);

        Nota[] minhasNotas = (Nota[]) myBlog.lerNotas().clone();
        for (Nota minhasNota : minhasNotas) {
            System.out.println(minhasNota.getDataCriacao());
            System.out.println(minhasNota.getAutor().getNome());
            System.out.println(minhasNota.getMensagem());
            System.out.println();
        }
    }
}
