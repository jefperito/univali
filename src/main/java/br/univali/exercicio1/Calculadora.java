package br.univali.exercicio1;

public class Calculadora {

    public int soma(int a, int b) {
        return a + b;
    }

    public int subtrai(int a, int b) {
        return a - b;
    }

    public int multiplica(int a, int b) {
        return a * b;
    }

    public int divide(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }

        return dividendo / divisor;
    }
}
