package produtos;
import autor.Autor;
public class MiniLivro  extends Livro{

    public MiniLivro(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        
        if(porcentagem > 0.4) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        //controlar o numero de numeros depois da virgula
        System.out.println("Valor do livro com desconto: " + getValor());
        
        return true;
    }
}