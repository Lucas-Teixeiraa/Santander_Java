package entities;
import java.util.Random;
public class ContaBancaria {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

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
