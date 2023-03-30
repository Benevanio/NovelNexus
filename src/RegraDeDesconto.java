import java.util.Scanner;
public class RegraDeDesconto {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setNome("No game No life");
        livro.setDescricao("Um livro sobre um jogo");
        livro.setIsbn("978-85-66250-46-6");
        livro.setCategoria("Aventura");
        livro.setEditora("JBC");
        livro.setValor(59.90);
        Autor autor = new Autor();
        autor.setNome("Yuu Kamiya");
        autor.setEmail("YuuKa@gmail.com");
        autor.setCpf("123.456.789-10");
        Scanner valorDesconto = new Scanner(System.in);
        System.out.println("Digite o valor do desconto: ");

        double desconto = valorDesconto.nextDouble();
        livro.aplicardDesconto(desconto);
        livro.mostrarDetalhes();
        valorDesconto.close();
    
    }
}
