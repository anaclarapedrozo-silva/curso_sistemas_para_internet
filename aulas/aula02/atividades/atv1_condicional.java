package aulas.aula02.atividades;

import java.util.Scanner;

public class atv1_condicional {
    public static void main(String[] args) {
        int numero, nMaior, nMenor, media;

        Scanner sc= new Scanner (System.in);
        nMaior = sc.nextInt();
        nMenor = nMaior;
        media = nMaior;

        for(int i = 1; i < 10; i++){
            numero = sc.nextInt();
            if (numero > nMaior){
                nMaior = numero;
            }else if (numero < nMenor){
                nMenor = numero;
            }
            media = (media + numero) / 10;
            
        }

        System.out.println("maior: " + nMaior);
        System.out.println("Menor: " + nMenor);
        System.out.println("Media: " + media);


        sc.close();
    }
}
