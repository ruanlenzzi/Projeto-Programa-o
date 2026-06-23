package controller;

import model.*;

public class QuiosqueController {
    private Atendimento atendimento;

    public void iniciarAtendimento() {
        atendimento = new Atendimento(1, "000.000.000-00");
        atendimento.setPedido(new Pedido(1));
        System.out.println("Atendimento iniciado.");
    }

    public void selecionarProduto() {
        Lanche lanche = new Lanche(
                1,
                "X-Burger",
                25,
                "Brioche",
                java.util.Arrays.asList("Carne", "Queijo")
        );

        ItemPedido item = new ItemPedido(lanche, 1);
        atendimento.getPedido().adicionarItem(item);

        System.out.println("Produto adicionado.");
    }

    public void finalizarPedido() {
        System.out.println("Total: R$ " + atendimento.getPedido().getTotal());
    }
}
