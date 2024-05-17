package Desafio_4_LogicasComLoops;

import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteDiario = scanner.nextDouble();

        double saldoRestante = limiteDiario;

        while (saldoRestante != 0) {
            double valorSaque = scanner.nextDouble();
            if(valorSaque==0){
                System.out.println("Transacoes encerradas.");
                break;
            }
            if (valorSaque > saldoRestante) {
                System.out.print("Limite diario de saque atingido. ");
                System.out.println("Transacoes encerradas.");
                break;
            } else {
                saldoRestante -= valorSaque;

                System.out.printf("Saque realizado. Limite restante: %.1f\n", saldoRestante);
            }
        }
        scanner.close();
    }
}
