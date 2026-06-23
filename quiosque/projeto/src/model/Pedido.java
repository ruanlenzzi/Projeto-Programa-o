package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
    private int idPedido;
    private LocalDateTime dataHora;
    private double total;
    private ArrayList<ItemPedido> itens;

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
        this.dataHora = LocalDateTime.now();
        this.total = 0;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
        total += item.getSubtotal();
    }

    public double getTotal() {
        return total;
    }
}
