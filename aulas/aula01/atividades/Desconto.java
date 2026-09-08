package aula01.atividades;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do produto: R$");
        double valor = sc.nextDouble();
        double desconto = 91.0 / 100 * valor;

        System.out.println("Com o descobto de 9% o valor ficou em R$" + desconto);
        sc.close();
    }

    
}
