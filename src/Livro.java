public class Livro {
    private String nome;
    private String descricao;
    private String isbn;
    private String categoria;
    private String editora;
    private double valor;
    private boolean impresso;
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
            System.out.println("Desconto não pode ser maior que 30%");
            return false;
        }else {
            double desconto = getValor() * porcentagem;
            setValor(getValor() - desconto);
            System.out.println("Valor do livro com desconto: " + getValor());
            return true;
        }
    }

    public Livro(Autor autor) {
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
        this.impresso = true;
    }

    public void setImpresso(boolean impresso) {
        this.impresso = impresso;
        System.out.println("O livro é impresso? " + this.impresso);
    }

    
   
}
