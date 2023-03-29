public class CalculadoreDeEstoque {
    public static void main(String[] args) {
        double LivroToradora = 80;
        double LivroReZero = 100;

        // usar o for para aplicar o desconto nos livros
        for (int i = 0; i < 1; i++) {
            LivroToradora = LivroToradora - (LivroToradora * 0.1);
            System.out.println("O valor do livro Toradora com desconto é: " + LivroToradora);
            LivroReZero = LivroReZero - (LivroReZero * 0.1);
            System.out.println("O valor do livro ReZero com desconto é: " + LivroReZero);
        }

        int quantidadeLivroToradora = 20;
        int quantidadeLivroReZero = 3;

        double valorTotalLivroToradora = LivroToradora * quantidadeLivroToradora;
        double valorTotalLivroReZero = LivroReZero * quantidadeLivroReZero;

        double valorTotalEstoque = valorTotalLivroToradora + valorTotalLivroReZero;

        System.out.println("O valor total do estoque é: " + valorTotalEstoque);
        if (valorTotalEstoque < 150) {
            System.out.println("Por favor, aumente o valor do estoque");
        } else if (valorTotalEstoque >= 2000) {
            System.out.println("O seu estoque se encontra em niveis aceitaveis");
        } else {
            System.out.println("O seu estoque se encontra em niveis criticos");
        }
    }

}