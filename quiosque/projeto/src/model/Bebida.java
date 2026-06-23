package model;

public class Bebida extends Produto {
    private int tamanho;
    private boolean isAlcoolica;

    public Bebida(int id, String nome, double preco, int tamanho, boolean isAlcoolica) {
        super(id, nome, preco);
        this.tamanho = tamanho;
        this.isAlcoolica = isAlcoolica;
    }

    @Override
    public String exibirDetalhes() {
        return nome + " - " + tamanho + "ml";
    }
}
