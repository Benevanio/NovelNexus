public class CalculadoreDeEstoque {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Toradora!";
        livro.descricao = "Um romance  entre um garoto e uma garota";
        livro.valor = 59.90;
        livro.isbn = "978-85-7522-480-7";
        livro.categoria = "Romance";
        livro.autor = "Yuyuko Takemiya";
        livro.editora = "JBC";
        System.out.println("O livro " + livro.nome + " foi adicionado ao estoque");
    }

}