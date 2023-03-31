import produtos.Ebook;
import produtos.Livro;

public class CarrinhoDeCompras {
    private double total;

    public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro);
        livro.aplicaDescontoDe(0.3);
        total += livro.getValor();
    }

    public double getTotal() {
        return total;
    }

}
