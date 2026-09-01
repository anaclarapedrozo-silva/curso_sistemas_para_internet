package aulas.aula02.atividades;

import java.util.Scanner;

public class thanos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hPartida, mPartida, hChegada, mChegada,  mTotal, hAuxiliar;

        hPartida = sc.nextInt();
        mPartida = sc.nextInt();
        hChegada = sc.nextInt();
        mChegada = sc.nextInt();

        mTotal = 60 - mPartida;

        if(hPartida <= hChegada){
            hAuxiliar = hChegada - (hPartida + 1);
        }else{
            hAuxiliar = (24 - (hPartida + 1)) + hChegada;
        }

        mTotal = mTotal + (hAuxiliar * 60) + mChegada;

        if (mTotal > 24 * 60){
            System.out.println("Thanos ficou muito bravo com você, a.a");
        }else{
            System.out.println("Ainda bem que você chegou a tempo rs, o Thanos ainda não ta bravo");
        }

        System.out.println(mTotal);
        sc.close();
    }
    
}
