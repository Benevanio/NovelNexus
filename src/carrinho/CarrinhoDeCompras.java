package carrinho;

import produtos.Produto;

public class CarrinhoDeCompras {

    private double total;
    private Object[] objects = new Object[10];
    private int contador = 0;
   
    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        Produto moldado = (Produto) objects[contador];
        total += moldado.getValor(); 
    }

    public double getTotal() {
        return total;
    }

}
