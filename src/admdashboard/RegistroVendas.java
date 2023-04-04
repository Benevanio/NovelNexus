package admdashboard;

import autor.Autor;
import carrinho.CarrinhoDeCompras;
import produtos.Livro;
import produtos.LivroFisico;

public class RegistroVendas {
    public static void main(String[] args) {
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
        livro.aplicaDescontoDe(0.2);
        livro.getTaxaImpressao(0.5);
        livro.mostrarDetalhes();
        carrinho.adiciona(livro);
        System.out.println("Total: " + carrinho.getTotal());
        
    }
}