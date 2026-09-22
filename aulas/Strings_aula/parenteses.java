package Strings_aula;

import java.util.Scanner;

public class parenteses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int parenteseAberto = 0;
        int parenteseFechado = 0;
        System.out.print("Expressão: ");
        String expressao = sc.next();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);
            if (caractere == '(') {
                parenteseAberto++;
            } else if (caractere == ')') {
                parenteseFechado++;
            }
        }

        if(parenteseAberto == parenteseFechado){
            System.out.println("parenteses corretos");
        }else{
            System.out.println("parenteses incorretos");
        }

        sc.close();
    }

}
