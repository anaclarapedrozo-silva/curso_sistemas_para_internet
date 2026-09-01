package aulas.aula02.atividades;

import java.util.Scanner;

public class bissexto {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int ano = sc.nextInt();

         if((ano % 400 == 0) || ((ano %4 == 0 )) && (ano % 100 != 0)){
            System.out.println("BISSEXTO");
         } else {
            System.out.println("NÃO BISSEXTO");
         }
         sc.close();
    }
    
}
