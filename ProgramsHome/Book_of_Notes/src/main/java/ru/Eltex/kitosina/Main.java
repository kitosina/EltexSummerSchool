package ru.Eltex.kitosina;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        final Parent root = FXMLLoader.load(new File("src/main/resources/MainWindows.fxml").toURL());

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("NoteEveryDay");
        primaryStage.show();
    }
}
