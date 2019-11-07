import java.util.Scanner;

public class Dicionario {
    public Dicionario() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Substantivo crianca = new Substantivo("Pessoa jovem");
        new Palavra("menino", "Tratamento familiar afetuoso dado a pessoas do sexo masculino, ainda que adultas.", crianca);
        new Palavra("menina", "Tratamento familiar e afetuoso dado a mulheres em idade adulta.", crianca);
        System.out.println("========================");
        System.out.println("   Digite uma palavra   ");
        System.out.println("========================");
        String p = scanner.next();
        Palavra palavr = (Palavra)crianca.getMapaPalavras().get(p);
        System.out.println(palavr.getPalavra());
        System.out.println(crianca.getSignificado());
        System.out.println(palavr.getColocacao());
    }
}
