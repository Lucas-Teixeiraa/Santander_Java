package entities;

import java.util.InputMismatchException;

public class Contador {
    public static void Contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;
        int cont = 0, i = 0;

        if (!(parametroUm > parametroDois)) {
            for(i = 0; i <= contagem; i++) {
                System.out.printf("O numero contado e: %d\n", i);
            }
        }
        else{
            throw new ParametrosInvalidosException();
        }

    }

}


