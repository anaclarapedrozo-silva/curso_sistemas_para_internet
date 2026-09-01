package aulas.aula02.condicionais;

import java.util.Scanner;

public class numero_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // fazendo com o while
        System.out.println("Digite um número inteiro: ");
        int numero2 = sc.nextInt();
        int i2 = 0;

        while (i2 <= 10) {
            System.out.println(numero2 + " x " + i2 + " = " + (numero2 * i2));
            i2++;
        }

        sc.close();
    }
}
