package aulas.aula01;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double dimensao1, dimensao2;

        System.out.print("escolha a dimensão 1: ");
        dimensao1 = sc.nextDouble();
        System.out.print("Escolha a dimensão 2: ");
        dimensao2 = sc.nextDouble();
        System.out.println("Àrea: " + (dimensao1 * dimensao2));
        sc.close();
    }


}
