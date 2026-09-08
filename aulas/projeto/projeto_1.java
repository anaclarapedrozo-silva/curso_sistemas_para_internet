package projeto;

import java.util.Scanner;

public class projeto_1 {
   
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Revista revista = new Revista();

        System.out.println("DESEJA CADASTRAR LIVRO ? ");
        System.out.println("a) sim ");
        System.out.println("b) não ");
        String resposta = sc1.next();

        while (resposta.equalsIgnoreCase("a")) {
            revista.Cadastrar();
            System.out.println("DESEJA ALTERAR O TIPO DA REVISTA? ");
            System.out.println("a) sim");
            System.out.println("b) não");
            String respostaTipo = sc1.next();
            if (respostaTipo.equalsIgnoreCase("a")) {
                revista.alterarTipo();
            } else {
                System.out.println("Ok");
            }
            System.out.println("DESEJA VERIFICAR SE A EDIÇÂO CORRESPONDE? ");
            System.out.println("a) sim");
            System.out.println("b) não");
            String respostaCorresponde = sc1.next();

            if (respostaCorresponde.equalsIgnoreCase("a")) {
                revista.comprovarEdicao();
            } else {
                System.out.println("Ok");
            }

            System.out.println("DESEJA CADASTRAR LIVRO ? ");
            System.out.println("a) sim ");
            System.out.println("b) não ");
            resposta = sc1.next();
        }

        sc1.close();
    }
}
