package Carrinho;

import produtos.Livro;
import produtos.Revista;

public class CarrinhoDeCompras {
    private double total;

    public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro);
        livro.aplicaDescontoDe(0.16);
        total += livro.getValor();
    }

    public void adiciona(Revista revista) {
        System.out.println("Adicionando: " + revista);
        revista.aplicaDescontoDe(0.15);
        total += revista.getValor();
    }

    public double getTotal() {
        return total;
    }

}
