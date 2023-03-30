public class Livro {
    private String nome;
    private String descricao;
    private String isbn;
    private String categoria;
    private String editora;
    private double valor;
    Autor autor;
   

    void mostrarDetalhes() {
        System.out.println("\nMostrando os detalhes do livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + getValor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Editora: " + getEditora());
        System.out.println("------");
        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }
        System.out.println("----------");

    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    boolean temAutor() {
        return this.autor != null;
    }

    boolean aplicardDesconto(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        this.setValor(this.getValor() - this.getValor() * porcentagem);
        return true;
    }

    public Livro(Autor autor) {
        this.autor = autor;
    }

    public Livro() {
    }

}
