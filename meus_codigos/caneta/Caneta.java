package meus_codigos.caneta;
public class Caneta {
    String modelo;
    String cor;
    double ponta;
    boolean tampada;

    void status() {
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Ponta da caneta: " + this.ponta);
        System.out.println("Está tampada? " + this.tampada);
    }

    void tampada() {
        if (this.tampada == true) {
            System.out.println("A caneta está tampada.");
        }else{
            System.out.println("A caneta está destampada.");
        }
    }

    void tampar(){
        if(this.tampada == true){
            System.out.println(("Já está tampada."));
        }else{
            this.tampada = true;
        }
    }

    void destampar(){
        if(this.tampada == false){
            System.out.println(("Já está destampada."));
        }else{
            this.tampada = false;
        }
    }
    
}
