public class Livro {
    String nome;
    String descricao;
    String isbn;
    String categoria;
    String editora;
    double valor;
    Autor autor;   
    void mostrarDetalhes() {
        System.out.println("Mostrando os detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Categoria: " + categoria);       
        System.out.println("Editora: " + editora);     

    }

    public void aplicardDesconto(double porcentagem) {
        this.valor -= this.valor * porcentagem;
    }
}
