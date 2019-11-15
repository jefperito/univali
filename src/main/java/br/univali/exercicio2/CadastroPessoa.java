package br.univali.exercicio2;

/**
 * Para criar um mock, usamos a biblioteca Mockito. conforme definido abaixo:
 * <Classe do objeto que vai ser mockada /> objeto = Mockito.mock(<Classe do objeto que vai ser mockada>)
 *
 * Caso queremos simular um comportamento de um método do mock, utilizamos a maneira abaixo:
 * Mockito.when(objeto.metodoQueVaiSerSimulado(parametros).thenReturn(objeto que queremos que retorne)
 *
 * Caso queremos checar iterações do mock (spy), usamos o seguinte:
 *
 * Mockito.verify(mock, Mockito.times(<quantidade de iteracoes>)).metodoQueQueremosChecarAQuantidadeDeIteracoes()
 */
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
