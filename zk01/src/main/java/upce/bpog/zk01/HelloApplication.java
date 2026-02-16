package upce.bpog.zk01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


//    /// JavaFX s FXML souborem - ten je umisten v main/resources/upce/bpog/zk01 (hello-view.fxml)
//    @Override
//    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
//    }

    /// JavaFX bez FXML souboru - vse se pise do tohoto filu, neni potreba Controller, ani FXML soubor
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("BPOG1 - Základ JavaFX/Maven aplikace bez FXML v InteliJ");

        StackPane stackPane = new StackPane(label);

        Scene scene = new Scene(stackPane, 600, 400);

        primaryStage.setTitle("BPOG1 - Základ JavaFX aplikace");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}