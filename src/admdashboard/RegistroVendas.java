package admdashboard;

import autor.Autor;
import carrinho.CarrinhoDeCompras;
import produtos.Ebook;
import produtos.Livro;
import produtos.LivroFisico;

public class RegistroVendas {
    public static void main(String[] args) {
        // livro fisico
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Autor autor = new Autor();
        autor.setNome("Alan F. Kay");
        autor.setEmail("Alan@gmail.com");
        autor.setCpf("123.456.789-00");
        autor.mostrarDetalhes();
        Livro livro = new LivroFisico(autor);
        livro.setNome("OOP");
        livro.setValor(59.90);
        livro.setDescricao("Uma introdução a POO e Java");
        livro.setIsbn("978-85-66250-46-6");
        livro.aplicaDescontoDe(0.3);
        livro.mostrarDetalhes();
        livro.setValor(livro.getValor() + LivroFisico.getTaxaImpressao(0.2));
        // ebook
        Autor autor2 = new Autor();
        autor2.setNome("Yūto Tsukuda");
        autor2.setEmail("YUKA@gmail.com");
        autor2.setCpf("123.456.789-10");
        autor2.mostrarDetalhes();
        Livro Manga = new Ebook(autor2);
        Manga.setNome("Shoukegeki no soma");
        Manga.setDescricao(
                "Shokugeki no Soma conta a história de um garoto chamado Sōma Yukihira, cujo sonho é se tornar um chef em tempo integral no restaurante de seu pai e superar suas habilidades culinárias.");
        Manga.setIsbn("978-85-66250-46-6");
        Manga.setValor(23.90);
        Manga.setWaterMark("New Pop");
        Manga.aplicaDescontoDe(0.5);
        Manga.mostrarDetalhes();
        // carrinho
        carrinho.adiciona(Manga);
        carrinho.adiciona(livro);
        //carrinho.remove(Manga);
        System.out.println("Total: " + carrinho.getTotal());
    }
}