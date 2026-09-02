package meus_codigos.republica;

public class Republica {
    public double valores[] = new double[5];
    public double media, mediaAgua;
    public double valoresAgua[] = new double[5];


    public void status(){
        System.out.printf("O valor da média com gastos de energia é de R$ %.2f%n", media);
        System.out.println("");
        System.out.printf("O valor da média com gastos de água é de R$ %.2f%n", mediaAgua);
    }

    public void mediaMesEnergia(){
        media = (this.valores[0] + this.valores[1] + this.valores[2] + this.valores[3] + this.valores[4]) / 5;
    }

    public void mediaMesAgua(){
        mediaAgua = (this.valoresAgua[0] + this.valoresAgua[1] + this.valoresAgua[2] + this.valoresAgua[3]+ this.valoresAgua[4]) / 5;
    }
    
}

