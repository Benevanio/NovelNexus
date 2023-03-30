public class Livro {
    private String nome;
    private String descricao;
    private String isbn;
    private String categoria;
    private String editora;
    private double valor;
    private boolean impresso;
    Autor autor;
   

   protected void mostrarDetalhes() {
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

   //se for ebook, desconto ate 15% se for impresso, desconto ate 30%

    public void aplicardDesconto(double porcentagem) {
        //ebook
        if (this.impresso == false) {
            if (porcentagem > 15) {
                System.out.println("Desconto invalido para ebook");
            } else {
                this.valor -= this.valor * porcentagem / 100;
                System.out.println("Valor do ebook com desconto: " + this.valor);
            }
        } else {
            if (porcentagem > 30) {
                System.out.println("Desconto invalido para livro impresso");
            } else {
                this.valor -= this.valor * porcentagem / 100;
                System.out.println("Valor do livro com desconto: " + this.valor);
            }
        }
    }


    public Livro(Autor autor) {
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
    }

    public void setImpresso(boolean impresso) {
        this.impresso = impresso;
        System.out.println("O livro é impresso? " + this.impresso);
    }
    
   
}
