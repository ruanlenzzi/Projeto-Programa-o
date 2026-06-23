package model;

public class Atendimento {
    private int idAtendimento;
    private String clienteCpf;
    private Pedido pedido;
    private StatusAtendimento status;

    public Atendimento(int idAtendimento, String clienteCpf) {
        this.idAtendimento = idAtendimento;
        this.clienteCpf = clienteCpf;
        this.status = StatusAtendimento.INICIADO;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setStatus(StatusAtendimento status) {
        this.status = status;
    }
}
