package Strings_aula;

import java.util.Scanner;

public class vogaisConsoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Palavra: ");
        String palavra = sc.next();
        int vogais = 0;
        int consoantes = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vogais++;
            } else {
                consoantes++;
            }
        }
        System.out.println(vogais);
        System.out.println(consoantes);

        sc.close();

    }
}
