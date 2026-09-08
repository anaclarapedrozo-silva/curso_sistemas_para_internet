 package projeto;

import java.util.Scanner;

public class Revista{

     String nome, tipo;
        double valor;
        int edicaoCadastrada, edicaoComprovada;
    
        Scanner sc = new Scanner(System.in);
    
        public void Status() {
            System.out.println("-----INFORMAÇÕES DA REVISTA-----");
            System.out.println("Nome: " + nome);
            System.out.println("Tipo: " + tipo);
            System.out.println("Valor: R$" + valor);
            System.out.println("Edição: " + edicaoCadastrada);
        }
    
        public void Cadastrar() {
            System.out.println("-----CADASTRAR NOVA REVISTA-----");
            System.out.print("Nome: ");
            this.nome = sc.nextLine();
            System.out.print("Tipo: ");
            this.tipo = sc.nextLine();
            System.out.print("Valor: R$");
            this.valor = sc.nextDouble();
            System.out.print("Edição: ");
            this.edicaoCadastrada = sc.nextInt();
    
            Status();
        }
    
        public void alterarTipo() {
            System.out.println("-----ALTERAR TIPO-----");
            System.out.print("Novo tipo: ");
            tipo = sc.next();
    
            Status();
        }
    
        public void comprovarEdicao() {
            System.out.println("-----CORRESPONDER EDIÇÃO-----");
            System.out.print("Digite a edição que deseja comprovar: ");
            this.edicaoComprovada = sc.nextInt();
    
            if (edicaoComprovada == edicaoCadastrada) {
                System.out.println("CORRESPONDE");
            } else {
                System.out.println("DIFERENTE");
            }
        }

 }
 