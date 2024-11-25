package controllers.justcalcul;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class YesColntroller {

    @FXML
    private Button nextBut;

    @FXML
    void goNext() throws IOException {

        Stage stage = (Stage) nextBut.getScene().getWindow();
        stage.close();

        Stage primaryStage = new Stage();

        Parent root = FXMLLoader.load(MainApplication.class.getResource("calcul-view.fxml"));
        primaryStage.setTitle("JustCevin");
        primaryStage.setScene(new Scene(root, 432, 530));
        primaryStage.show();

    }

}
