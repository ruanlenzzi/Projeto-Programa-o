package model;

import java.util.ArrayList;

public class Estabelecimento {
    private int idEstabelecimento;
    private String nomeEstabelecimento;
    private String endereco;
    private ArrayList<Atendimento> atendimentos;

    public Estabelecimento(int id, String nome, String endereco) {
        this.idEstabelecimento = id;
        this.nomeEstabelecimento = nome;
        this.endereco = endereco;
        this.atendimentos = new ArrayList<>();
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }
}
