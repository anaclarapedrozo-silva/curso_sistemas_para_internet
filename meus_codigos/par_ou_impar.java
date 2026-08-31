package meus_codigos;
import java.util.Scanner;

public class par_ou_impar
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, mundo!");

         
        System.out.print("Escolha um número: ");
        int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.println("É par");
        }else{
            System.out.println("É ímpar");
        }

        sc.close();
    }
}