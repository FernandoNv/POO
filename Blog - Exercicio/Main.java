import Entidades.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();

        Usuario usuario = new Usuario(nome, email);
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
    }
}
