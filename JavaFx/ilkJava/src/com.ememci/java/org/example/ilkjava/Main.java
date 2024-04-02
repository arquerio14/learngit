package org.example.ilkjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {}

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Sample.fxml"));
        VBox rootNode = loader.load();

        Scene scene = new Scene(rootNode,500,500);
        stage.setScene(scene);
        stage.setTitle("Merhava Java Fx");
        stage.show();
    }
}