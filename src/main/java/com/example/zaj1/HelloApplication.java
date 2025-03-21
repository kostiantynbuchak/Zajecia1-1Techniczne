package com.example.zaj1;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 350, 400);
        stage.setTitle("Kalkulator i licznik tekstu");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    public void add(ActionEvent actionEvent) {
        controller.add();
    }

    public void subtract(ActionEvent actionEvent) {
        controller.subtract();
    }

    public void multiply(ActionEvent actionEvent) {
        controller.multiply();

    public void divide(ActionEvent actionEvent) {
        controller.divide();
    }



    public void analyzeText(ActionEvent actionEvent) {
        controller.analyzeText();

    }
}
