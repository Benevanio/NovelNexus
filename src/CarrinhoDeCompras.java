import produtos.Ebook;
import produtos.LivroFisico;

public class CarrinhoDeCompras {
    public void adiciona(LivroFisico livro) {
        System.out.println("Adicionando: " + livro);
    }

    public void adiciona(Ebook livro) {
        System.out.println("Adicionando: " + livro);
    }

}
