package br.univali.exercicio2;

public class CadastroPessoa {

    private final Database database;

    public CadastroPessoa(Database database) {
        this.database = database;
    }

    public Pessoa buscarPessoaPeloId(Long id) {
        if (id == null || id == 0) {
            throw new IllegalStateException("ID inválido");
        }

        Pessoa pessoa = (Pessoa) database.buscaPeloId(id, "pessoa");

        System.out.println("Pessoa pelo ID: " + pessoa.getId() + " buscada no banco de dados.");

        return pessoa;
    }

    public void salvar(Pessoa pessoa) {
        if (pessoa == null) {
            throw new IllegalStateException("Pessoa está nula");
        }

        if (pessoa.getId() == 0) {
            database.insere(pessoa);
        } else {
            database.atualiza(pessoa);
        }
    }
}
