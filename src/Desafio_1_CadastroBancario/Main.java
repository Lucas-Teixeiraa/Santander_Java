package Desafio_1_CadastroBancario;

import java.util.Scanner;
import entities.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria user = new ContaBancaria();

        System.out.println("Bem Vindo ao Banco!");
        System.out.println("Se voce ja tem cadastro digite (S), se nao aperte (C)!");
        System.out.println("Ou deseja finalizar a sessao digite (E)");
        String verifica;

        do{
            verifica = sc.nextLine().toUpperCase();
                if(verifica.equals("C")) user.criarConta();
                else if (verifica.equals("S")) user.consultaConta();
                System.out.println("O deseja fazer agora?");
        }while ((!verifica.equals("E")));

    }

}
