package br.univali.jeferson.exercicio1;

public class AnalisadorDeTexto {

    public int contaVogais(String texto) {
        int contador = 0;
        for (char caracter : texto.toLowerCase().toCharArray()) {
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public String getConsoantes(String texto) {
        String consoantes = "";

        for (char caracter : texto.toLowerCase().toCharArray()) {
            if (caracter != 'a' && caracter != 'e' && caracter != 'i' && caracter != 'o' && caracter != 'u') {
                consoantes += caracter;
            }
        }
        return consoantes;
    }
}
