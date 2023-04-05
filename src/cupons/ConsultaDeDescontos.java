package cupons;

public class ConsultaDeDescontos {
    public static void main(String[] args) {
        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();

        Double desconto = gerenciador.getDesconto("CUPOM10");
        if(desconto != null) {
            System.out.println("Cupom válido");
        } else {
            System.out.println("Cupom inválido");
        }

    
    }
}
