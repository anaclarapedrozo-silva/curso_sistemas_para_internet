package aula03.atividade;

import java.util.Scanner;

public class quadrilha_ano {

    public static int calcularCrescimento(int atual, int anterior){
        return atual - anterior;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anoInicial, publicoInicial, crescimento, anterior, menorPublico, anoMenor, totalAnos, atual;
        
        System.out.print("Adicione o ano inicial: ");
        anoInicial = sc.nextInt();

        System.out.println("Quantos anos tem? ");
        totalAnos = sc.nextInt();

        System.out.println("Público: ");
        publicoInicial = sc.nextInt();

        anterior = anoInicial;
        atual = sc.nextInt();
        crescimento = calcularCrescimento(atual, anterior);
        menorPublico = crescimento;
        anoMenor = 1;
        int i =2;

        while (i <= totalAnos){
            anterior = atual;
            atual = sc.nextInt();
            crescimento = calcularCrescimento(atual, anterior);
            if(crescimento < menorPublico){
                menorPublico = crescimento;
                anoMenor = 1;
            }
            i++;
        }
        
        System.out.println(anoInicial - anoMenor);
        sc.close();
    }

}
