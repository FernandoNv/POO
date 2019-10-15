package Mercado;
import Pagamentos.Dinheiro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //Scanner scanner = new Scanner(System.in);
        Produto ps4 = new Produto("PS4", 1499, 10, 1);
        //Produto ps3 = new Produto("PS3", 999, 10, 2);
        //Produto xbox360 = new Produto("Xbox 360", 799, 10, 3);
        Produto xbox = new Produto("Xbox One", 1299, 10, 4);
        //Produto nintento = new Produto("Nintendo", 899, 10, 5);
        //Produto gtx1080 = new Produto("Gtx 1080", 1499, 10, 6);
        //Produto gtx1070 = new Produto("Gtx 1070", 1299, 10, 7);
        //Produto tv = new Produto("TV", 1499, 10, 8);
        Produto celular = new Produto("Celular", 1499, 10, 9);
        //Produto computador = new Produto("Computador", 1499, 10, 10);

        //System.out.println("Informe o cpf: ");
        //String cpf = scanner.next();

        Cliente cliente = new Cliente("123-123-123-18");

        Item item1 = new Item(ps4, 1);
        Item item2 = new Item(xbox, 1);
        Item item3 = new Item(celular, 1);

        Pagamento dinheiro = new Dinheiro();
        Pedido pedido = new Pedido(1, cliente, dinheiro);
        pedido.addItem(item1);
        pedido.addItem(item2);
        pedido.addItem(item3);

        System.out.println("CPF: " + cliente.getCpf());
        for(Item i: pedido.getListaItens()){
            System.out.println("Produto: " + i.produto.getNome());
            System.out.println("Preco: " + i.produto.getPreco());
            System.out.println("Quantidade " + i.getQuantidade());
            System.out.println("----------------------------------");

        }
        System.out.println("Valor da compra: " + pedido.valorTotal());

        System.out.println("----------------------------------");
        System.out.println("Produto: " + ps4.getNome());
        System.out.println("Quantidade " + ps4.getQuantidade());
        System.out.println("----------------------------------");
        System.out.println("Preco: " + xbox.getNome());
        System.out.println("Quantidade " + xbox.getQuantidade());
        System.out.println("----------------------------------");
        System.out.println("Quantidade " + celular.getNome());
        System.out.println("Quantidade " + celular.getQuantidade());
        System.out.println("----------------------------------");
    }
}
