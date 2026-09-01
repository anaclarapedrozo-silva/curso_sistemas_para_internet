package aulas.aula02.atividades;

import java.util.Scanner;

public class pesquisador {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double alturainicial, tempoQueda;

        alturainicial = sc.nextDouble();
        tempoQueda = sc.nextDouble();
;
        double alturaFinal = (alturainicial * 1000) - 0.5 * 9.8 * (tempoQueda * tempoQueda);
        double velocidadeFinal = 9.8  * tempoQueda;

        System.out.println(alturaFinal);
        System.out.println(velocidadeFinal);





        sc.close();
    }
    
}
