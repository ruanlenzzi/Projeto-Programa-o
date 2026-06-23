package app;

import javafx.application.Application;
import javafx.stage.Stage;
import view.TelaQuiosque;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        new TelaQuiosque().start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
