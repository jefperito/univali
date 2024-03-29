package br.univali.exercicio1;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class CalculadorConceito {

    /**
     * Implemente um algoritmo que retorne o conceito baseado na nota
     *
     *  |     Nota     | Conceito
     *  --------------------------
     *  | 9,0	       | A
     *  | 7,5 e < 9,0  | B
     *  | 6,0 e < 7,5  | C
     *  | < 6,0        | D
     *
     *  OBS 1: não deve permitir nota abaixo de 0.
     *  OBS 2: não deve permitir nota acima de 10.
     */
    public char calculaConceitoBaseadoNaNota(double nota) {
        if (nota < 0) {
            throw new IllegalArgumentException("Nota abaixo de zero");
        }
        if (nota > 10) {
            throw new IllegalArgumentException("Nota acima de 10");
        }
        if (nota > 9) {
            return 'A';
        }
        throw new NotImplementedException();
    }
}
