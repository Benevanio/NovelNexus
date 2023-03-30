import java.util.Scanner;
public class RegraDeDesconto {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Yuu Kamiya");
        autor.setEmail("YuuKa@gmail.com");
        autor.setCpf("123.456.789-10");

        Livro livro = new Livro(autor);

        //usando o boolean para aplicar desconto em livros com impressao
        livro.setImpresso(true);

        livro.setNome("No game No life");
        livro.setDescricao("Shokugeki no Soma conta a história de um garoto chamado Sōma Yukihira, cujo sonho é se tornar um chef em tempo integral no restaurante de seu pai e superar suas habilidades culinárias.");
        livro.setIsbn("978-85-66250-46-6");
        livro.setCategoria("Aventura");
        livro.setEditora("JBC");
        livro.setValor(59.90);
    
        Scanner valorDesconto = new Scanner(System.in);
        System.out.println("Digite o valor do desconto: ");

        double desconto = valorDesconto.nextDouble();
        livro.aplicardDesconto(desconto);
        livro.mostrarDetalhes();
        valorDesconto.close();
    
    }
}
