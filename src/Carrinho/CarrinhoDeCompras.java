package Carrinho;

import produtos.Produto;

public class CarrinhoDeCompras {

    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;

    public void adiciona(Produto produto) {
        this.produtos[contador] = produto;
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                total = new java.math.BigDecimal(total + produto.getValor())
                        .setScale(1, java.math.RoundingMode.HALF_EVEN).doubleValue();
            }

        }
    }

    // total = new java.math.BigDecimal(total + produto.getValor()).setScale(1,
    // java.math.RoundingMode.HALF_EVEN).doubleValue();

    public double getTotal() {
        return total;
    }

}
