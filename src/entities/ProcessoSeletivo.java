package entities;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void selecionaCandidatos(String[] candidatos){

        int candidatosSelecionadosIndex = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        String[] candidatosSelecionados = new String[5];
        while(candidatosSelecionadosIndex < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou o valor de R$%.2f\n", candidato, salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                candidatosSelecionados[candidatosSelecionadosIndex] = candidato;
                candidatosSelecionadosIndex++;

            }
            candidatosAtual++;
        }
        for (int i = 0; i < candidatosSelecionados.length; i++) {
            if (candidatosSelecionados[i] != null) {
                System.out.printf("---Candidato Selecionado %s---\n", candidatosSelecionados[i]);
            }
        }

    }

    static double valorPretendido(){//Gera valores aleatorios entre 1800 e 2200.
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    public static void analiseCandidato(){//Analise se o salario escolhido do candidato bate com o salario da vaga
        double salarioPretendido = valorPretendido();
        double salarioBase = 2000.0;
        if(salarioPretendido < salarioBase ){
            System.out.println("lIGAR PARA O CANDIDATO");
        }
        else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("Aguardar mais candidatos");
        }
    }
}
