package com.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/views/App.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/styles/app.css").toExternalForm());
            stage.setScene(scene);

            stage.show();
        } catch (IOException err) {
            System.out.println(err.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }

}