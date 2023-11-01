package br.edu.fatecl.mvcdemo.models;

public class Jogo {
    private String nome;
    private String dataLancamento;

    public Jogo(String nome, String dataLancamento) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
