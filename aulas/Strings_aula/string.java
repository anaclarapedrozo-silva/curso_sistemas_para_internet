package Strings_aula;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //tamanho de uma string considerando o espaço

        String string = "Kim Seungmin";
        int tamanhodaString = string.length();
        System.out.println("A palavra " + string + " tem " + tamanhodaString + " caracteres");

        //tamanho de uma string sem contar o espaço

        int tamanhoString2 = string.replace(" ", "").length();
        System.out.println("A palavra " + string + " tem " + tamanhoString2 + " caracteres");

        
        //retornar um caractere que está em uma posição especifica
        
        char caractere = string.charAt(2);
        System.out.println(caractere); // retorna a letra que está naposição 2 da string
        
        //transformar strings em maiúscula ou minúscula
        
        String stringMaiuscula = string.toUpperCase();
        System.out.println(stringMaiuscula);
        String stringMinuscula = string.toLowerCase();
        System.out.println(stringMinuscula);
        
        //remover espaços em branco da string
        
        String stringComEspaco = "    Kim Seungmin";
        String formatado = stringComEspaco.trim();
        System.out.println("Antes: " + stringComEspaco);
        System.out.println("Depois: " + formatado);
        
        //substituir letras ou caracteres na string
        
        String substituicao = string.replace("Kim", "Seo");
        System.out.println(substituicao);
        
        //comparação de strings com equals
        
        String string2 = "cachorro";
        if(string.equals(string2)){
            System.out.println("é igual");
        }else{
            System.out.println("não é igual");
        }
        
        //comparação ignorando letras maiusculas e minusculas
        
        if(string.equalsIgnoreCase(stringMaiuscula)){
            System.out.println("é igual");
        }else{
            System.out.println("não é igual");
        }
        
        //conferir se o texto possui algo
        
        if(string.contains("Kim")){
            System.out.println("o texto tem Kim");
        }else{
            System.out.println("o texto não tem Kim");
        }

        //verificar se a string começa ou termina com algo

        if(string.startsWith("Kim")){
            System.out.println("começa com Kim");
        }else{
            System.out.println("não começa com Kim");
        }

         if(string.endsWith("min")){
            System.out.println("termina com min");
        }else{
            System.out.println("não termina com min");
        }

        //encontrar qual index uma caractere está ou qual index uma palavra começa

        int index = string.indexOf("n");
        System.out.println(index);

        //pegar algo da string a partir de um index

        System.out.println(string.substring(4));

        //dividir a string e transformar em lista

        String string3 = "k,i,m, , s,e,u,n,g,m,i,n";
        String[] stringDivida = string3.split(",");

        for(String letra : stringDivida){
            System.out.println(letra);
        }

        //coverter outros tipos pra string

        int idade = 26;
        String idadeString = String.valueOf(idade);

        System.out.println(idadeString);
        sc.close();
    }
}
