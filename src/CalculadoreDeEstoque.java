
public class CalculadoreDeEstoque {
    public static void main(String[] args) {
        double LivroToradora =89.90;
        double LivroReZero = 80;

        int quantidadeLivroToradora = 2;
        int quantidadeLivroReZero = 3;

        double valorTotalLivroToradora = LivroToradora * quantidadeLivroToradora;
        double valorTotalLivroReZero = LivroReZero * quantidadeLivroReZero;

        double valorTotalEstoque = valorTotalLivroToradora + valorTotalLivroReZero;

        System.out.println("O valor total do estoque é: " + valorTotalEstoque);
        

    }

}