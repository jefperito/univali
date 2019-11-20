package br.univali.exercicio1;

import org.junit.Assert;
import org.junit.Test;

public class CalculadorConceitoTest {

    @Test
    public void naoDevePermitirNotaAbaixoDeZero() {
        try {
            new CalculadorConceito().calculaConceitoBaseadoNaNota(-1);
            Assert.fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void naoDevePermitirNotaAcimaDe10() {
        try {
            new CalculadorConceito().calculaConceitoBaseadoNaNota(11);
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void deveRetornarConceitoAQuandoNotaEhAcimaDe9() {
        char conceito = new CalculadorConceito().calculaConceitoBaseadoNaNota(9.1);
        Assert.assertEquals('A', conceito);
    }
}