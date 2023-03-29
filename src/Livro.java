public class Livro {
    String nome;
    String descricao;
    String isbn;
    String categoria;
    String editora;
    private double valor;
    Autor autor;

    void mostrarDetalhes() {
        System.out.println("\nMostrando os detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + getValor());
        System.out.println("ISBN: " + isbn);
        System.out.println("Categoria: " + categoria);
        System.out.println("Editora: " + editora);
        System.out.println("------");
        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }
        System.out.println("----------");

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    boolean temAutor() {
        return this.autor != null;
    }

    void adicionaValor(double valor) {
        this.setValor(valor);
    }
    double retornaValor() {
        return this.getValor();
    }
    boolean aplicardDesconto(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        this.setValor(this.getValor() - this.getValor() * porcentagem);
        return true;
    }
}
