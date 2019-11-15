package br.univali.exercicio2;

import java.util.HashMap;
import java.util.Map;

public class CadastroPessoa {

    private final Database database;
    private Map<Long, Pessoa> cachePessoas;

    public CadastroPessoa(Database database) {
        this.database = database;
        cachePessoas = new HashMap<>();
    }

    public Pessoa buscarPessoaPeloId(Long id) {
        if (id == null || id == 0) {
            throw new IllegalStateException("Pessoa não possui nome");
        }

        Pessoa pessoa = (Pessoa) database.buscaPeloId(id, Pessoa.class);

        System.out.println("Pessoa pelo ID: " + pessoa.getId() + " buscada no banco de dados.");

        return pessoa;
    }
}
