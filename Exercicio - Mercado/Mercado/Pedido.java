package Mercado;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private Cliente cliente;
    private Pagamento pagamento;
    private List<Item> listaItens = new ArrayList<>();

    public Pedido(int id, Cliente cliente, Pagamento pagamento){
        this.id = id;
        this.cliente = cliente;
        this.pagamento = pagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addItem(Item item){
        listaItens.add(item);
    }

    public Item[] getListaItens() {
        Item[] vet = new Item[this.listaItens.size()];
        vet = listaItens.toArray(vet);

        return vet;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public float valorTotal(){
        Item[] vetItens = getListaItens();
        float soma = 0;
        for(Item i : vetItens){
            soma = soma + i.produto.getPreco()* i.getQuantidade();
        }

        return soma;
    }
}
