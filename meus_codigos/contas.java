package meus_codigos;
import java.util.Scanner;

public class contas {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Escolha um número: ");
        int x = sc.nextInt();
        System.out.print("Escolha outro número: ");
        int y = sc.nextInt();
        System.out.println("O que você deseja fazer com esses dois números? ");
        System.out.println("(a) Somar");
        System.out.println("(b) Subtrair");
        System.out.println("(c) Dividir");
        System.out.println("(d) Multiplicar");

        String escolha = sc.next();

        if(escolha.equals("a")){
            int soma = x + y;
            System.out.println("A soma de " + x + " + " + y + " = " + soma);
        }else if (escolha.equals("b")) {
            int subtracao = x - y;
            System.out.println("A subtração de " + x + " - " + y + " = " + subtracao);
        }else if (escolha.equals("c")) {
            int divisao = x / y;
            System.out.println("A divisão de " + x + " / " + y + " = " + divisao);
        }else if (escolha.equals("d")) {
            int multiplicacao = x * y;
            System.out.println("A multiplicação de " + x + " x " + y + " = " + multiplicacao);
        }else{
            System.out.println("Essa escolha nem tem sentido!! Tchau...");
        }
        sc.close();
    }
    
}
