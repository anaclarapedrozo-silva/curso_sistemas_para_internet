package aulas.aula03.atividade;

import java.util.Scanner;

public class banco {

    Scanner sc1 = new Scanner(System.in);

    private String nome, agencia;
    private double saldo, deposito, saque;

    public double criarConta() {
        System.out.println("Nome do dono da conta: ");
        this.nome = sc1.next();
        System.out.println("Agência: ");
        this.agencia = sc1.next();
        System.out.println("Saldo: ");
        this.saldo = sc1.nextDouble();

        return saldo;
    }

    public double sacar() {
        System.out.println("Valor do saque: R$");
        this.saque = sc1.nextDouble();
        if (saque > saldo) {
            System.out.println("Vc não tem dinheiro pro saque.");
        } else {
            this.saldo = saldo -= saque;
            System.out.println("Seu saldo atual é de: R$" + saldo);
        }

        return saldo;
    }

    public double depositar() {
        System.out.println("Valor do depósito: R$");
        this.deposito = sc1.nextDouble();
        this.saldo += deposito;

        System.out.println("Seu saldo agora é de R$" + saldo);

        return saque;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        banco banco = new banco();
        String escolha = "a";

        while(!escolha.equals("d")){
            System.out.println("O que deseja fazer? ");
            System.out.println("a) criar conta");
            System.out.println("b) sacar ");
            System.out.println("c) depositar ");
            System.out.println("d) sair");;
            escolha = sc.next();
    
            if(escolha.equals("a")){
                banco.criarConta();
            }else if (escolha.equals("b")){
                banco.sacar();
            }else if(escolha.equals("c")){
                banco.depositar();
            }else{
                System.out.println("saindo byee");
            }
        }

        sc.close();
    }
}
