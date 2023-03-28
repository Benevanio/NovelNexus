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
        if (valorTotalEstoque < 150){
            System.out.println("Por favor, aumente o valor do estoque");
        } else if (valorTotalEstoque >= 2000){
            System.out.println("O seu estoque se encontra em niveis aceitaveis");
        } else {
            System.out.println("O seu estoque se encontra em niveis criticos");
        }
    }

}