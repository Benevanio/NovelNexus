public class RegraDeDesconto {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setValor(59.90);

        System.out.println("Valor atual: " + livro.getValor());

        if (!livro.aplicardDesconto(0.3)) {
            System.out.println("Desconto não pode ser maior que 30%");
        } else {
            System.out.println("Valor com desconto: " + livro.getValor());
        }

    }
}
