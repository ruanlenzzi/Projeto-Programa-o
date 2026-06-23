package view;

import controller.QuiosqueController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaQuiosque {
    private QuiosqueController controller;

    public TelaQuiosque() {
        controller = new QuiosqueController();
    }

    public void start(Stage stage) {
        Button btn1 = new Button("Iniciar Atendimento");
        Button btn2 = new Button("Adicionar X-Burger");
        Button btn3 = new Button("Finalizar Pedido");

        btn1.setOnAction(e -> controller.iniciarAtendimento());
        btn2.setOnAction(e -> controller.selecionarProduto());
        btn3.setOnAction(e -> controller.finalizarPedido());

        VBox root = new VBox(15);
        root.getChildren().addAll(btn1, btn2, btn3);

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Quiosque");
        stage.setScene(scene);
        stage.show();
    }
}
