package produtos;
import autor.Autor;
public class MiniLivro  extends Livro{

    public MiniLivro(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        //mini livros desconto de 40%
        if(porcentagem > 0.4) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }
}