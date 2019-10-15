package Mercado;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String cpf;
    private List<Pedido> listaPedidos = new ArrayList<>();
    public Cliente(String cpf){
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pedido[] getListaPedidios(){

        Pedido[] vet = new Pedido[this.listaPedidos.size()];
        vet = listaPedidos.toArray(vet);

        return vet;
    }
}
