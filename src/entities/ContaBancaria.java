package entities;
import java.util.Random;
import java.util.Scanner;

public class ContaBancaria {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;
    private Scanner sc = new Scanner(System.in);


    public void criarConta(){
            System.out.println("Insira seu nome completo: ");
            nomeCliente = sc.nextLine();
            saldo = GerarSaldo();
            agencia = gerarNumeroAgencia();
            numero = gerarNumeroConta();
            System.out.printf("Bem vindo ao Banco! Sr(a) %s, seu numero de conta eh %d, sua agencia eh %s e foi gerado um saldo novo para uso, de  R$%.2f\n", nomeCliente, numero, agencia, saldo);
    }

    public String consultaConta(){
        System.out.println("Insira sua agencia e seu numero da conta por favor: ");
        System.out.print("Agencia: ");
        agencia = sc.nextLine();
        System.out.print("Numero da Conta: ");
        numero = sc.nextInt();
        return System.out.printf("Olá %s! Voce eh nosso cliente, Sua agência é [%s] e conta [%d] e seu saldo [%.2f] já está disponível para saque.\n", nomeCliente, agencia, numero, saldo).toString();
    }

    public double GerarSaldo(){
        Random random = new Random();
        int[] novoSaldo = new int[3];
        for(int i = 0; i < novoSaldo.length; i++){
            novoSaldo[i] = random.nextInt(9);
        }

        double valorSaldo = 0.0;
        for(int geraSaldo : novoSaldo){
            valorSaldo += geraSaldo;
        }
        return valorSaldo;
    }

    public String gerarNumeroAgencia(  ){
        Random random = new Random();
        int[] digitos = new int[5];
        for (int i = 0; i < digitos.length; i++) {
            digitos[i] = random.nextInt(10);
        }
        String numeroAgencia = "";
        for (int digito : digitos) {
            numeroAgencia += String.valueOf(digito);
        }
        StringBuilder sb = new StringBuilder(numeroAgencia);
        sb.insert(3, "-");
        numeroAgencia = sb.toString();

        return numeroAgencia;
    }

    public int gerarNumeroConta() {
        Random random = new Random();

        // Generate 5 digits
        int[] digitos = new int[5];
        for (int i = 0; i < digitos.length; i++) {
            digitos[i] = random.nextInt(10);
        }

//
        int numeroConta = 0;
        for (int i = digitos.length - 1; i >= 0; i--) {
            numeroConta += digitos[i] * (int) Math.pow(10, i);
        }

        return numeroConta;
    }
}
