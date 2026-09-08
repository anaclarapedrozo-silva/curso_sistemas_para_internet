package aula01.atividades;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double temperaturaCelsius;

        System.out.println("Escreva uma temperatura em graus celsius: ");
        temperaturaCelsius = sc.nextDouble();

        double fahrenheit = temperaturaCelsius * 1.8 + 32;
        double kelvin = temperaturaCelsius + 273.15;

        System.out.println("A temperatura em Celsius: " + temperaturaCelsius + "°");
        System.out.println("A temperatura em Fahrenheit: " + fahrenheit + "F");
        System.out.println("A temperatura em Kelvin: " + kelvin + "K");

        sc.close();

    }
}
