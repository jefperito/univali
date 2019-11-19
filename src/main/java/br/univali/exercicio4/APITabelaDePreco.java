package br.univali.exercicio4;

/**
 * Essa classe deve ser mockada, ela "busca" os dados através de uma API os valores dos filmes para locação de um outro software.
 */
public class APITabelaDePreco {


    public double getValorFilmeNormal() {
        System.out.println("Está chamando o método real! :/");
        return 1.5;
    }

    public double getValorFilmeInfantil() {
        System.out.println("Está chamando o método real! :/");
        return 1.5;
    }

    public double getValorFilmeLancamento() {
        System.out.println("Está chamando o método real! :/");
        return 3;
    }
}
