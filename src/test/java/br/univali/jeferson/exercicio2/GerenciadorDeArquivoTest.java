package br.univali.jeferson.exercicio2;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;

public class GerenciadorDeArquivoTest {

    @Test
    public void deveLancarExcecaoCasoArquivoSejaUmDiretorio() {
        File arquivoMock = Mockito.mock(File.class);
        Mockito.when(arquivoMock.isFile()).thenReturn(false);
        Mockito.when(arquivoMock.getName()).thenReturn("Diretório de teste");

        GerenciadorFTP gerenciadorFTPMock = Mockito.mock(GerenciadorFTP.class);

        try {
            new GerenciadorDeArquivo(gerenciadorFTPMock).armazenaArquivo(arquivoMock);
            Assert.fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void deveEnviarViaFTPCasoArquivoSejaUmArquivo() {
        File arquivo = Mockito.mock(File.class);
        Mockito.when(arquivo.isFile()).thenReturn(true);
        Mockito.when(arquivo.getName()).thenReturn("arquivoteste.txt");

        GerenciadorFTP gerenciadorFTP = Mockito.mock(GerenciadorFTP.class);

        new GerenciadorDeArquivo(gerenciadorFTP).armazenaArquivo(arquivo);

        Mockito.verify(gerenciadorFTP, Mockito.times(1)).enviaArquivo(arquivo, "/texto");
    }
}