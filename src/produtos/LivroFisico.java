package produtos;

import autor.Autor;

public class LivroFisico extends Livro {
    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaImpressao(double d) {
        System.out.println("Taxa de impressão: " + d);
        return this.getValor() * 0.5;
    }
    
}