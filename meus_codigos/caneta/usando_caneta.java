package meus_codigos.caneta;

import java.util.Locale;

public class usando_caneta {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Caneta caneta1 = new Caneta();
        caneta1.modelo = "Caneta bic";
        caneta1.cor = "Preta";
        caneta1.ponta = 0.7;
        caneta1.tampada = true;

        caneta1.status();
        caneta1.tampar();
        caneta1.destampar();
    }
}
