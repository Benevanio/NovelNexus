public class Ebook  extends Livro {
    private String waterMark;
    
    public Ebook(Autor autor) {
        super(autor);
    }
    
    public String getWaterMark() {
        return waterMark;
    }
    
    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
    
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            System.out.println("Desconto não pode ser maior que 15%");
            return false;

        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Valor do livro com desconto: " + getValor());
        return true;

       }       
}
    
