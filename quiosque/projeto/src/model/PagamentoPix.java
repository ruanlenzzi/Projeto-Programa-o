package model;

public class PagamentoPix implements IPagamento {
    private String chavePix;
    private String idTransacao;

    @Override
    public boolean processarPagamento(double valor) {
        return true;
    }
}
