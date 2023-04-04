package cupons;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorDeCupons {
    private Set<String> cupons;
    public GerenciadorDeCupons() {
        this.cupons = new HashSet<>();
        this.cupons.add("CUPOM10");
        this.cupons.add("CUPOM20");
        this.cupons.add("CUPOM30");
        this.cupons.add("CUPOM40");
        this.cupons.add("CUPOM50");
    }
    public boolean ValidaCupom(String cupom) {
        return this.cupons.contains(cupom);
    }
}