package produtos;

import java.math.RoundingMode;

import Admdashboard.Promocional;
import autor.Autor;

public class MiniLivro extends Livro implements Promocional {
    public MiniLivro(Autor autor) {
        super(autor);
    }
    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.4) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        desconto = new java.math.BigDecimal(desconto).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
        setValor(new java.math.BigDecimal(getValor() - desconto).setScale(2, RoundingMode.HALF_EVEN).doubleValue());
        System.out.println("Valor do desconto: " + desconto);
        System.out.println("Valor final do livro: " + getValor());
        return true;
    }
}