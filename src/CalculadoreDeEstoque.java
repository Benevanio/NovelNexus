public class CalculadoreDeEstoque {
    public static void main(String[] args) {
        double LivroToradora = 90;
        double LivroReZero = 100;

        int quantidadeLivroToradora = 20;
        int quantidadeLivroReZero = 3;

        double valorTotalLivroToradora = LivroToradora * quantidadeLivroToradora;
        double valorTotalLivroReZero = LivroReZero * quantidadeLivroReZero;

        double valorTotalEstoque = valorTotalLivroToradora + valorTotalLivroReZero;
        
        System.out.println("O valor total do estoque é: " + valorTotalEstoque);
        if (valorTotalEstoque < 200) {
            System.out.println("Seu estoque está muito baixo");
        } else if (valorTotalEstoque >= 200 && valorTotalEstoque <= 500) {
            System.out.println("Seu estoque está bom");
        } else if (valorTotalEstoque > 500) {
            System.out.println("Seu estoque está muito alto, considere vender alguns produtos");
        }else {
            System.out.println("Valor inválido");
        }
    }

}