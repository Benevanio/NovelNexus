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
     
    
    
   
}
    
