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
	
	@Override
	public String toString() {
		return "Eu sou um Ebook";
	}


}
