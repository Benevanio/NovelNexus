import java.util.Scanner;

import autor.Autor;
import produtos.Ebook;
import produtos.Livro;

public class RegraDeDesconto {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Yuu Kamiya");
        autor.setEmail("YuuKa@gmail.com");
        autor.setCpf("123.456.789-10");

        Livro livro = new Livro(autor);

        livro.setNome("No game No life");
        livro.setDescricao(
                "Shokugeki no Soma conta a história de um garoto chamado Sōma Yukihira, cujo sonho é se tornar um chef em tempo integral no restaurante de seu pai e superar suas habilidades culinárias.");
        livro.setIsbn("978-85-66250-46-6");

        livro.setValor(59.90);
        Scanner valorDesconto = new Scanner(System.in);
        System.out.println("Digite o valor do desconto: ");

        double desconto = valorDesconto.nextDouble();
        livro.aplicaDescontoDe(desconto);
        livro.mostrarDetalhes();
        valorDesconto.close();

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
        ebook.setValor(16.00);
        ebook.setWaterMark("New Pop");
        ebook.aplicaDescontoDe(0.5);

        ebook.setWaterMark("New Pop");
        ebook.mostrarDetalhes();

    }
}
