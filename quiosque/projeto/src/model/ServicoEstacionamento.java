package model;

public class ServicoEstacionamento extends Produto {
    private String placaVeiculo;
    private String tempoPermanencia;

    public ServicoEstacionamento(int id, String nome, double preco, String placaVeiculo, String tempoPermanencia) {
        super(id, nome, preco);
        this.placaVeiculo = placaVeiculo;
        this.tempoPermanencia = tempoPermanencia;
    }

    @Override
    public String exibirDetalhes() {
        return nome + " - " + placaVeiculo;
    }
}
