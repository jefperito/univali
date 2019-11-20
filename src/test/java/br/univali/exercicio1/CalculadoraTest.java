package br.univali.exercicio1;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void deveSomarDoisNumerosInteirosPositivos() {
        int resultado = new Calculadora().soma(1, 1);

        Assert.assertEquals(2, resultado);
    }

    @Test
    public void deveSubtrairDoisNumerosInteirosPositivos() {
        int resultado = new Calculadora().subtrai(1, 1);

        Assert.assertEquals(0, resultado);
    }

    @Test
    public void deveMultiplicarDoisNumerosInteirosPositivos() {
        int resultado = new Calculadora().multiplica(1, 1);

        Assert.assertEquals(1, resultado);
    }

    @Test
    public void deveDividirDoisNumerosInteirosPositivos() {
        int resultado = new Calculadora().divide(1, 1);

        Assert.assertEquals(1, resultado);
    }

    @Test
    public void deveLancarExcecaoCasoDivisorSejaZero() {
        try {
            new Calculadora().divide(1, 0);
            Assert.fail();
        } catch (IllegalArgumentException e) {
        }
    }
}