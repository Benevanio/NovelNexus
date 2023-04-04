package cupons;

public class ConsultaDeDescontos {
    public static void main(String[] args) {
        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
       if (gerenciador.ValidaCupom("CUPOM80")) {
           System.out.println("Cupom válido");
       } else {
           System.out.println("Cupom inválido");
       }
    
    }
}
