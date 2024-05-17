package Desafio_4_LogicasComLoops;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        int valida = 1;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (valida != 0) {

            int opcao = scanner.nextInt();
            // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
            switch(opcao){
                case 0:
                    System.out.println("Programa encerrado.");
                    valida = 0;
                    break;
                case 1:
                    //System.out.println("Digite o valor novo: ");
                    double novoSaldo = scanner.nextDouble();
                    saldo = novoSaldo;
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 2:
                    //System.out.println("Digite o valor que deseja sacar: ");
                    double sacarSaldo = scanner.nextDouble();
                    if (sacarSaldo > saldo){
                        System.out.println("Saldo insuficiente.");
                    }else{
                        saldo = saldo - sacarSaldo;
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }


        }
    }
}
