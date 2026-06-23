package model;

public class PagamentoCartaoCredito implements IPagamento {
    private String numeroCartao;
    private String bandeira;
    private int parcelas;

    @Override
    public boolean processarPagamento(double valor) {
        return true;
    }
}
