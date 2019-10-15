package Pagamentos;
import Mercado.Pagamento;

public class CartaoCredito extends Pagamento{
    public void paga(){
        System.out.println("Pagamento: Cartão de Crédito");
    }
}
