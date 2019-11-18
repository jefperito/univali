package br.univali.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private List<Aluguel> alugueis;

    public Cliente(String nome) {
        this.nome = nome;
        this.alugueis = new ArrayList<Aluguel>();
    }

    public void addAluguel(Aluguel aluguel) {
        this.alugueis.add(aluguel);
    }

    public String getNome() {
        return nome;
    }

    public String exibirRegistroAlugueis() {
        double tot = 0;
        int p = 0;
        StringBuilder dados = new StringBuilder();
        dados.append("Registro de Aluguéis do cliente: " + getNome() + "\n");
        for (Aluguel aluguel : this.alugueis) {
            double vl = 0;

            // Calcula o valor do aluguel
            switch (aluguel.getFilme().getPreco()) {
                case Filme.NORMAL:
                    vl += 1.5;
                    if (aluguel.getDiasAluguel() > 3)
                        vl += (aluguel.getDiasAluguel() - 3) * 1.5;
                    break;
                case Filme.INFANTIL:
                    vl += 2;
                    if (aluguel.getDiasAluguel() > 2)
                        vl += (aluguel.getDiasAluguel() - 2) * 1.5;
                    break;
                case Filme.LANCAMENTO:
                    vl += aluguel.getDiasAluguel() * 3;
                    break;
            }

            // Adiciona um ponto
            p++;

            // Bônus para mais de dois dias com um lançamento
            if (aluguel.getFilme().getPreco() == Filme.LANCAMENTO
                    && aluguel.getDiasAluguel() > 1)
                p++;

            // Adiciona os dados desse aluguel
            dados.append("\t" + aluguel.getFilme().getTitulo() + "\t");
            dados.append(" = R$ " + String.valueOf(vl) + "\n");

            tot += vl;
        }

        // Rodapé
        dados.append("Total gasto com aluguéis: R$ " + String.valueOf(tot) + "\n");
        dados.append("Pontos ganhos: " + String.valueOf(p));

        return dados.toString();
    }
}