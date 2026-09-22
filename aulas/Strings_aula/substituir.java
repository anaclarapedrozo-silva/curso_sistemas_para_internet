package Strings_aula;

import java.util.Scanner;

public class substituir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Frase: ");
        String frase = sc.nextLine();

        System.out.print("caractere 1: ");
        char caractere1 = sc.next().charAt(0);

        System.out.print("caractere 2: ");
        char caractere2 = sc.next().charAt(0);

        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {
            char caractereAtual = frase.charAt(i);
            if (caractereAtual == caractere1) {
                resultado = resultado + caractere2;
            } else {
                resultado = resultado + caractereAtual;
            }
        }

        System.out.println(resultado);

        sc.close();
    }

}
