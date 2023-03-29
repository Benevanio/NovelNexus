import java.util.Scanner;
public class RegraDeDesconto {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "No game No life";
        livro.descricao = "Um livro sobre um jogo";
        livro.isbn = "978-85-66250-46-6";
        livro.categoria = "Aventura";
        livro.editora = "JBC";
        livro.setValor(59.90);
        Autor autor = new Autor();
        autor.nome = "Yuu Kamiya";
        autor.email = "YuuKa@gmail.com";
        autor.cpf = "123.456.789-10";


       //aplicar o desconto no livro
        Scanner valorDesconto = new Scanner(System.in);
        System.out.println("Digite o valor do desconto: ");

        double desconto = valorDesconto.nextDouble();
        livro.aplicardDesconto(desconto);
        livro.mostrarDetalhes();
        valorDesconto.close();
    
    }
}
