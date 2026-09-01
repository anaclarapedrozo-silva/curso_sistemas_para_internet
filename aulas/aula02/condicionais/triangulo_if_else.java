package aulas.aula02.condicionais;

import java.util.Scanner;

public class triangulo_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        if (a < (b + c) && b < (a + c) && c < (b + a)) {
            System.out.println("Deu um triângulo válido. ");
            if (a == b && a == c){
                System.out.println("Equilátero");
            }else if( a == b || b == c || c == a){
                System.out.println("Isóceles");
            }else{
                System.out.println("Escaleno");
            }
        }else{
            System.out.println("Não deu um triângulo válido.");
        }
        sc.close();
    }

}
