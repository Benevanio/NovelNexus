
import java.util.Scanner;
public class RegraDeDesconto {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do livro: ");
        double valor = leitor.nextDouble();
        System.out.println("Digite a porcentagem de desconto: ");
        double porcentagem = leitor.nextDouble();
        Livro livro = new Livro();
        livro.setValor(valor);
        livro.aplicardDesconto(porcentagem);
        System.out.println("O valor do livro com desconto é: " + livro.getValor());
        leitor.close();

    }
}
