package produtos;
import admdashboard.Promocional;
import autor.Autor;

public class LivroFisico extends Livro  implements Promocional{
    
    public LivroFisico(Autor autor) {
        super(autor);
    }

    @Override 
    public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem > 0.3) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
    }

    public double getTaxaImpressao(double d) {
        return this.getValor() * 0.5;
    }  
    @Override
    public void mostrarDetalhes() {
        System.out.println("Mostrando detalhes do Ebook ");
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("ISBN: " + getIsbn());

        if (this.temAutor()) {
            getAutor().mostrarDetalhes();
        }
        System.out.println("--");
    }
	
	@Override
	public String toString() {
		return "Eu sou um Livro Fisico";
	}  
}