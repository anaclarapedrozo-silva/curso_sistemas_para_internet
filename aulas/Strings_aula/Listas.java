package Strings_aula;

import java.util.Arrays;
import java.util.Scanner;

public class Listas {

    Scanner sc = new Scanner(System.in);

    public String[] criarListas(int i) {
        String[] lista = new String[i];
        for (int i2 = 0; i2 < i; i2++) {

            System.out.print((i2 + 1) + "° palavra: ");
            String palavra = sc.next();
            lista[i2] = palavra;
        }

        return lista;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Listas listas = new Listas();

        System.out.println("----- 1° LISTA -----");
        System.out.print("Quantas indices? ");
        int i1 = sc.nextInt();
        String[] lista1 = listas.criarListas(i1);

        System.out.println("----- 2° LISTA -----");
        System.out.print("Quantas indices? ");
        int i2 = sc.nextInt();
        String[] lista2 = listas.criarListas(i2);

        System.out.println("----- 3° LISTA -----");
        System.out.print("Quantas indices? ");
        int i3 = sc.nextInt();
        String[] lista3 = listas.criarListas(i3);

        int[] numeros = new int[i3];

        System.out.println(Arrays.toString(lista1));
        System.out.println(Arrays.toString(lista2));
        System.out.println(Arrays.toString(lista3));

        for (int i4 = 0; i4 < lista3.length; i4++) {
            String palavraAtual = lista3[i4];
            int contador = 0;
            for (int i5 = 0; i5 < lista1.length; i5++) {
                String palavraAtualLista1 = lista1[i5];
                if (palavraAtualLista1.equals(palavraAtual)) {
                    contador++;
                }
            }
            for (int i6 = 0; i6 < lista2.length; i6++) {
                String palavraAtualLista2 = lista2[i6];
                if (palavraAtualLista2.equals(palavraAtual)) {
                    contador++;
                }
                numeros[i4] = contador;
            }
        }
        System.out.println(Arrays.toString(numeros));
        sc.close();
    }

}
