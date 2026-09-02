package meus_codigos.republica;

import java.util.Scanner;

public class republica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Republica republica = new Republica();

        for (int i = 0; i < 5; i++) {
            System.out.print("Valor da conta de energia no mês " + (i+1) + " R$:");
            republica.valores[i] = sc.nextDouble();

        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Valor da conta de água no mês " + (i+1) + " R$:");
            republica.valoresAgua[i] = sc.nextDouble();

        }

        republica.mediaMesEnergia();

        // System.out.print("Valor da conta de energia mês 1: R$");
        // republica.valor1 = sc.nextDouble();
        // System.out.print("Valor da conta de energia mês 2: R$");
        // republica.valor2 = sc.nextDouble();
        // System.out.print("Valor da conta de energia mês 3: R$");
        // republica.valor3 = sc.nextDouble();
        // System.out.print("Valor da conta de energia mês 4: R$");
        // republica.valor4 = sc.nextDouble();
        // System.out.print("Valor da conta de energia mês 5: R$");
        // republica.valor5 = sc.nextDouble();


        // System.out.print("Valor da conta de água mês 1: R$");
        // republica.valor1agua = sc.nextDouble();
        // System.out.print("Valor da conta de água mês 2: R$");
        // republica.valor2agua = sc.nextDouble();
        // System.out.print("Valor da conta de água mês 3: R$");
        // republica.valor3agua = sc.nextDouble();
        // System.out.print("Valor da conta de água mês 4: R$");
        // republica.valor4agua = sc.nextDouble();
        // System.out.print("Valor da conta de água mês 5: R$");
        // republica.valor5agua = sc.nextDouble();

        // republica.mediaMesAgua();

        republica.status();

        sc.close();
    }

}
