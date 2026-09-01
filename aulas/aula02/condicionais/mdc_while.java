package aulas.aula02.condicionais;

import java.util.Scanner;

public class mdc_while {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int quociente = numero / 10;
        int contador = 0;

        while (quociente != 0) {
            int resto = numero % 10;
            numero = quociente;
            quociente = numero / 10;
            System.out.println("resto: " + resto);
            contador++;
        }
        System.out.println("O número foi dividido " + contador + " vezes");

        sc.close();
    }
    
}
