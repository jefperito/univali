package br.univali.exercicio2;

public class CadastroPessoa {

    private final Database database;

    public CadastroPessoa(Database database) {
        this.database = database;
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
