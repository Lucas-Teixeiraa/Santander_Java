package Desafio_3_Contador;

import entities.ParametrosInvalidosException;

import java.util.InputMismatchException;
import java.util.Scanner;

import static entities.Contador.Contar;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor de entrada: ");
        int entradaUm = sc.nextInt();
        System.out.println("Digite o segundo valor de entrada: ");
        int entradaDois = sc.nextInt();

        try {
            Contar(entradaUm, entradaDois);
        }catch(ParametrosInvalidosException e){
            System.out.println("O primeiro valor deve ser menor que o segundo!");
        }
    }

}
