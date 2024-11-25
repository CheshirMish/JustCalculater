package controllers.justcalcul;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(MainApplication.class.getResource("main-view.fxml"));
        primaryStage.setTitle("JustCevin");
        primaryStage.setScene(new Scene(root,420, 240));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}