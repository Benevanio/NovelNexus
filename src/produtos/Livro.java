package produtos;
import autor.Autor;
public abstract class Livro {

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;

	public Livro(Autor autor) {
		if (autor == null) {
			throw new IllegalArgumentException("O autor do livro não pode ser nulo");
		}
	}

	public void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro ");
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);

		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}
		System.out.println("--");
	}

	boolean temAutor() {
		return this.autor != null;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public boolean aplicaDescontoDe(double porcentagem) {
		if (this instanceof Ebook) {
			System.out.println("Aplicando desconto no Ebook com a taxa de impressão");
			Ebook ebook = (Ebook) this;
			ebook.setValor(ebook.getValor() - ebook.getValor() * porcentagem);
			System.out.println("Valor do Ebook " + ebook.getValor());
			return true;
		}	
		else if (this instanceof LivroFisico) {
			System.out.println("Aplicando desconto no livro com a taxa de impressão");
			LivroFisico livroFisico = (LivroFisico) this;
			livroFisico.getTaxaImpressao(livroFisico.getTaxaImpressao(porcentagem) - livroFisico.getTaxaImpressao(porcentagem) * porcentagem);
			System.out.println("Valor do livro  " + livroFisico.getValor());
			return true;
		}

		return false;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Livro))
			return false;
		Livro outro = (Livro) obj;
		return this.isbn.equals(outro.isbn);
	}

	

}
