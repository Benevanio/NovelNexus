package Carrinho;

import produtos.Produto;

public class CarrinhoDeCompras {

    private double total;
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    private Produto[] produtos = new Produto[5];

    /**
     * @param produto
     */
    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        this.produtos[1] = produto;
        this.total += produto.getValor();
    
    }
    
}

