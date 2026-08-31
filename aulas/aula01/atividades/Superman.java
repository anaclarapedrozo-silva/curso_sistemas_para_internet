package aulas.aula01.atividades;

import java.util.Scanner;

public class Superman {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int energia;
        int minutos;
        int socos;

        System.out.print("Escolha a energia  da luta em kilojaules: ");
        energia = sc.nextInt();
        System.out.print("Escreva quantos minutos durou a luta: ");
        minutos = sc.nextInt();


        socos = ((minutos * 60) / 5) * 10;
        int reducao = energia - socos * 12;

        System.out.println(socos);
        System.out.println(reducao);


        sc.close();
    }
    
}
