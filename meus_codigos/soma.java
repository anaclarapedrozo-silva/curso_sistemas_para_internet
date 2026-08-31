package meus_codigos;
import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha o primeiro número: ");
        int x = sc.nextInt();
        System.out.print("Escolha o segundo número: ");
        int y = sc.nextInt();

        int soma = x + y;

        System.out.println("Soma entre eles: " + x + " + " + y + " = " + soma);

        sc.close();
    }
    
}
