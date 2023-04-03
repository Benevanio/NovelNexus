package Carrinho;

import produtos.Produto;
import java.lang.ArrayIndexOutOfBoundsException;
public class CarrinhoDeCompras {

    private double total;
    private Produto[] produtos = new Produto[10];


    public void adiciona(Produto produto) {
        for (int i = 0; i <= produtos.length; i++) {
            try {
                if (produtos[i] == null) {
                    produtos[i] = produto;
                    total += produto.getValor();
                    break;
                    
            }
            } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("deu exception no indice: "+ i);
            }
            }
            System.out.println("Fui executado!");
    }

    // total = new java.math.BigDecimal(total + produto.getValor()).setScale(1,
    // java.math.RoundingMode.HALF_EVEN).doubleValue();

    public double getTotal() {
        return total;
    }

}
