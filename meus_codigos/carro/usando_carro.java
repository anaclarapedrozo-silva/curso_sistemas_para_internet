package meus_codigos.carro;

import java.util.Locale;

public class usando_carro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Carro carro1 = new Carro();
        carro1.marca = "AUDI";
        carro1.cor = "Preto";
        carro1.ano = 2012;
        carro1.parado = true;
        carro1.porta = true;
        carro1.status();
        carro1.andar();
        carro1.abrirPorta();
        carro1.fecharPorta();
    }
}
