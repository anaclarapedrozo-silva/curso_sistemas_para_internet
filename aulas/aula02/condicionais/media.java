package aulas.aula02.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Digite uma nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite outra nota: ");
        double nota2 = sc.nextDouble();

        while (nota1 > 0 && nota2 > 0) {
            double media = (nota1 + nota2) / 2;
            System.out.printf("Sua média foi: %.1f%n", media);
        }

        sc.close();


    }

}
