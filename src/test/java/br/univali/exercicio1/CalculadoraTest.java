package br.univali.exercicio1;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void deveSomarDoisNumerosInteirosPositivos() {
        Assert.assertEquals(2, new Calculadora().soma(1, 1));
    }
}