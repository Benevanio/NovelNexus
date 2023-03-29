public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    String categoria;
    Autor autor;
   
    String editora;
    void mostrarDetalhes() {
        System.out.println("Mostrando os detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Categoria: " + categoria);
       
        System.out.println("Editora: " + editora);
    }
}
