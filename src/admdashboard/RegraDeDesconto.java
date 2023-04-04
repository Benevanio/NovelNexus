package admdashboard;

import autor.Autor;
import carrinho.CarrinhoDeCompras;
import produtos.Ebook;
import produtos.Livro;
import produtos.LivroFisico;

public class RegraDeDesconto {
    public static void main(String[] args) {
        Autor autor2 = new Autor();
        autor2.setNome("Yūto Tsukuda");
        autor2.setEmail("YuTsu@gmail.com");
        autor2.setCpf("123.456.789-10");
        autor2.mostrarDetalhes();
        Livro Manga = new LivroFisico(autor2);
        Manga.setNome("Shoukegeki no soma");
        Manga.setDescricao(
                "Shokugeki no Soma conta a história de um garoto chamado Sōma Yukihira, cujo sonho é se tornar um chef em tempo integral no restaurante de seu pai e superar suas habilidades culinárias.");
        Manga.setIsbn("978-85-66250-46-6");
        Manga.setValor(23.90);
        Manga.aplicaDescontoDe(0.3);
        Manga.setValor(Manga.getValor() + LivroFisico.getTaxaImpressao(8));
        Manga.mostrarDetalhes();
        // ebook
        Autor autor4 = new Autor();
        autor4.setNome("Makoto Shinkai");
        autor4.setEmail("MakotoShink@gmail.com");
        autor4.setCpf("123.456.789-10");
        autor4.mostrarDetalhes();
        Ebook ebook = new Ebook(autor4);
        ebook.setNome("Notonoha no Niwa");
        ebook.setDescricao(
                "Notonoha no Niwa é uma série de light novels japonesa escrita  Makoto Shinkai e ilustrado Midori Motobashi, conta a historia de um casal que se conhece em um jardim de flores.");
        ebook.setIsbn("978-85-66250-46-6");
        ebook.setValor(26.00);
        ebook.setWaterMark("New Pop");
        ebook.aplicaDescontoDe(0.2);
        ebook.mostrarDetalhes();
        // carrinho
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(Manga);
        carrinho.adiciona(ebook);
        // carrinho valor total
        System.out.println("Total, com descontos " + carrinho.getTotal());

    }
}
