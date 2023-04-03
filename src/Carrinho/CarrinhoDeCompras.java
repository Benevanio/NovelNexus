package Carrinho;

import produtos.Produto;

public class CarrinhoDeCompras {

    private double total;
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;
    private Produto produto4;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        if (this.produto1 != null) {
            this.produto1 = produto;
        } else if (this.produto2 != null) {
            this.produto2 = produto;
        } else if (this.produto3 != null) {
            this.produto3 = produto;
        } else if (this.produto4 != null) {
            this.produto4 = produto;
        } else if (this.produto4 != null) {
            this.produto4 = produto;
        } else {
            System.out.println("Não tem mais espaços");
            return;
        }
        total += produto.getValor();
    }
}
