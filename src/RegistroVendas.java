import autor.Autor;
import produtos.Ebook;
import produtos.LivroFisico;

public class RegistroVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Sun Tzu");
        autor.mostrarDetalhes();

        LivroFisico livro = new LivroFisico(autor);
        livro.setNome("O Arte da Guerra");
        livro.mostrarDetalhes();

        Ebook ebook = new Ebook(autor);
        ebook.setNome("O Arte da Guerra");
        ebook.mostrarDetalhes();

    }
}
