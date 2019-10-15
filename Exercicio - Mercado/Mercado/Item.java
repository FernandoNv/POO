package Mercado;

public class Item {
    final Produto produto;
    private int quantidade;
    public Item(Produto produto, int quantidade){
        this.produto = produto;
        setQuantidade(quantidade);
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(this.produto.disponivel()){
            if(this.produto.getQuantidade() - quantidade > 0){
                this.produto.setQuantidade(this.produto.getQuantidade() - quantidade);
                this.quantidade = quantidade;
            }
        }
    }
}
