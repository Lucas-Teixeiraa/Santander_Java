package Desafio_1;

import java.util.Scanner;
import entities.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria user = new ContaBancaria();

        System.out.println("Bem Vindo ao Banco!");
        System.out.println("Se voce ja tem cadastro digite (S), se nao aperte (N)!");
        System.out.println("Ou deseja finalizar a sessao digite (E)");
        String verifica;

        do{
            verifica = sc.nextLine().toUpperCase();
                if(verifica.equals("S")) {
                    System.out.println("Insira sua agencia e seu numero da conta por favor: ");
                    System.out.print("Agencia: ");
                    user.agencia = sc.nextLine();
                    System.out.print("Numero da Conta: ");
                    user.numero = sc.nextInt();
                    System.out.printf("Olá %s, obrigado por criar " + "uma conta em nosso banco, sua agência é %s, " + "conta %d e seu saldo %.2f já está disponível para saque.\n", user.nomeCliente, user.agencia, user.numero, user.saldo);
                }
                else if (verifica.equals("N")) {
                    System.out.println("Insira seu nome completo: ");
                    user.nomeCliente = sc.nextLine();
                    user.saldo = user.GerarSaldo();
                    user.agencia = user.gerarNumeroAgencia();
                    user.numero = user.gerarNumeroConta();
                    System.out.printf("Bem vindo ao Banco! Sr(a) %s, seu numero de conta eh %d, sua agencia eh %s e seu saldo novo eh %.2f\n", user.nomeCliente, user.numero, user.agencia, user.saldo);
                }
        }while ((!verifica.equals("E")));

    }

}
