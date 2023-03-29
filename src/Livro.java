public class Livro {
    String nome;
    String descricao;
    String isbn;
    String categoria;
    String editora;
    double valor;
    Autor autor;
    void mostrarDetalhes() {
        System.out.println("\nMostrando os detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Categoria: " + categoria);
        System.out.println("Editora: " + editora);
        System.out.println("------");
        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }
        System.out.println("----------");

    }
    boolean temAutor() {        
        return this.autor != null;
    }

    public void aplicardDesconto(double porcentagem) {
       if(porcentagem > 0.3) {
           System.out.println("Desconto não pode ser maior que 30%");
       } else {
           this.valor -= this.valor * porcentagem;
       }
    }
}
