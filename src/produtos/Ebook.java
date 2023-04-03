package produtos;
import admdashboard.Promocional;
import autor.Autor;
public class Ebook extends Livro implements Promocional {
	private String waterMark;
	
	public Ebook(Autor autor) {
		super(autor);
	}
	@Override
    public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.15) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
    }
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public String getWaterMark() {
		return waterMark;
	}	
	
	@Override
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
