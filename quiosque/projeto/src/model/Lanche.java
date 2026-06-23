package model;

import java.util.List;

public class Lanche extends Produto {
    private String tipoPao;
    private List<String> ingredientes;

    public Lanche(int id, String nome, double preco, String tipoPao, List<String> ingredientes) {
        super(id, nome, preco);
        this.tipoPao = tipoPao;
        this.ingredientes = ingredientes;
    }

    @Override
    public String exibirDetalhes() {
        return nome + " - " + ingredientes;
    }
}
