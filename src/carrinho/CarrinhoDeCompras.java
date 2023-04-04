package carrinho;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import produtos.Produto;

public class CarrinhoDeCompras {

    private double total;
    List<Produto> produtos = new ArrayList<Produto>();
    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        produtos.add(produto);
        this.total = new BigDecimal(this.total + produto.getValor()).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
    }

    public void remove(Produto produto) {
        System.out.println("Removendo: " + produto);
        this.total -= produto.getValor();
    }

    public double getTotal() {
        return total;
    }

    public  List<Produto> getProdutos() {
        return produtos;
    }

}
