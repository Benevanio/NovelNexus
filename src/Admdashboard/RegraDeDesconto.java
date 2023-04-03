package Admdashboard;

import autor.Autor;
import produtos.Livro;
import produtos.MiniLivro;

public class RegraDeDesconto {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Julio Verne");
        autor.setEmail("Julio@gmail.com");
        autor.setCpf("123.456.789-10");
        autor.mostrarDetalhes();

        Livro livro = new MiniLivro(autor);
        livro.setNome("20000 Léguas Submarinas");
        livro.setDescricao("Uma aventura submarina");
        livro.setValor(29.90);
        livro.setIsbn("978-85-66250-46-6");
        livro.mostrarDetalhes();

        if (livro.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto aplicado");
        } else {
            System.out.println("Desconto não pode ser maior que 30%");
        }

    }
}
