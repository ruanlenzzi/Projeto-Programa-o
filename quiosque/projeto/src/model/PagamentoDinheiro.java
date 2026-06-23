package model;

public class PagamentoDinheiro implements IPagamento {
    private double valorRecebido;
    private double troco;

    @Override
    public boolean processarPagamento(double valor) {
        return true;
    }
}
