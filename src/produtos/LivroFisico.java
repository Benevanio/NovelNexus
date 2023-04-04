package produtos;

import java.math.BigDecimal;
import java.math.RoundingMode;

import admdashboard.Promocional;
import autor.Autor;

public class LivroFisico extends Livro implements Promocional {

    public LivroFisico(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            System.out.println("Desconto não pode ser maior que 30%");
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }

    public static double getTaxaImpressao(double d) {
        d = new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println("valor da taxa: " + d);
        return d ;

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