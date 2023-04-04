package produtos;
import admdashboard.Promocional;

public class Revista implements Produto, Promocional {

    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    public Editora getEditora() {
        return editora;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.1) {
            System.out.println("Desconto não pode ser maior que 10%");
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("Valor do desconto: " + desconto);
        System.out.println("Valor final da revista: " + getValor());
        return true;
    }
   
}
