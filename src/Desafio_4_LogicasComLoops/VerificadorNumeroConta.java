package Desafio_4_LogicasComLoops;

import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        try {
            verificaNumeroConta(entrada);
            System.out.println("Numero de conta valido.");
        }catch (InvalidContaLengthException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void verificaNumeroConta(String numeroConta) throws InvalidContaLengthException {
        if(numeroConta.length() !=8){
            throw new InvalidContaLengthException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }

    public static class InvalidContaLengthException extends Exception {
        public InvalidContaLengthException(String message) {
            super(message);
        }
    }
}
