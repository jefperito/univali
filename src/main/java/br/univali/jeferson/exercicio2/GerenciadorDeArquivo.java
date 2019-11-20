package br.univali.jeferson.exercicio2;

import java.io.File;

public class GerenciadorDeArquivo {

    private GerenciadorFTP gerenciadorFTP;

    public GerenciadorDeArquivo(GerenciadorFTP gerenciadorFTP) {
        this.gerenciadorFTP = gerenciadorFTP;
    }

    public void armazenaArquivo(File file) {
        if (!file.isFile()) {
            throw new IllegalArgumentException(file.getName() + " não é um arquivo!");
        }

        String extensaoDoArquivo = getExtensaoDoArquivo(file);
        String diretorio = getDiretorioPelaExtensaoDoArquivo(extensaoDoArquivo);

        gerenciadorFTP.enviaArquivo(file, diretorio);
    }

    private String getDiretorioPelaExtensaoDoArquivo(String extensaoDoArquivo) {
        if (extensaoDoArquivo.equalsIgnoreCase("txt")) {
            return "/texto";
        }
        return "/pdfs";
    }

    private String getExtensaoDoArquivo(File file) {
        return file.getName().split("\\.")[1];
    }
}
