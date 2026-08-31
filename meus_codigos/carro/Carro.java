package meus_codigos.carro;

public class Carro {
    String marca;
    String cor;
    int ano;
    boolean parado;
    boolean porta;

    void status() {
        System.out.println("Marca do carro: " + marca);
        System.out.println("Cor do carro: " + cor);
        System.out.println("Ano de lançamento do carro: " + ano);
        System.out.println("O carro está parado? " + parado);
        System.out.println("A porta do carro está aberta? " + porta);
    }

    void andar() {
        if (this.parado == false || this.porta == true) {
            System.out.println("O carro já está em movimento ou a porta está aberta.");
        } else {
            this.parado = false;
            System.out.println("O carro está andando. ");
        }
    }

    void abrirPorta(){
        if(this.parado == false){
            System.out.println("Não é apropriado abrir a porta com o carro em movimento..");
        }else{
            System.out.println("Abriu a porta.");
            this.porta = true;
        }
    }

    void fecharPorta(){
        if(this.porta == false){
            System.out.println("A porta já está fechada.");
        }else{
            System.out.println("Fechou a porta.");
            this.porta = false;
        }
    }
}
