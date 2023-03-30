package produtos;

import autor.Autor;

public class Ebook extends Livro {
	private String waterMark;
	
	public Ebook(Autor autor) {
		super(autor);
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public String getWaterMark() {
		return waterMark;
	}

    //imporime o watermark

    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do Ebook ");
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Watermark: " + waterMark);

        if (this.temAutor()) {
            getAutor().mostrarDetalhes();
        }
        System.out.println("--");
    }
	
	@Override
	public String toString() {
		return "Eu sou um Ebook";
	}


}
