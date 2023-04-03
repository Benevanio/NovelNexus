package produtos;
import java.math.BigDecimal;

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
       double desconto = new  BigDecimal(getValor() * porcentagem).setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();
        System.out.println("Valor do desconto: " + desconto);
        setValor(getValor() - desconto);
        return true;
    }

    public double getTaxaImpressao(double d) {
        return this.getValor() * 0.5;
    }    
}