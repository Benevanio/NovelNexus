package carrinho;

import java.math.BigDecimal;

import produtos.Produto;

public class CarrinhoDeCompras {

    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        this.produtos[contador] = produto;
        contador++;
        total =new BigDecimal(total + produto.getValor()).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public double getTotal() {
        return total;
    }

}
