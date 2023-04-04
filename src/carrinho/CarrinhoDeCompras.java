package carrinho;

import java.math.BigDecimal;
import java.math.RoundingMode;

import produtos.Produto;

public class CarrinhoDeCompras {

    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;

    /**
     * @param produto
     */
    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        this.produtos[contador] = produto;
        contador++;
        this.total = new BigDecimal(this.total + produto.getValor()).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public double getTotal() {
        return total;
    }

}
