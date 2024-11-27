package controllers.justcalcul;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class NoController {

    @FXML
    private Button age_but;

    @FXML
    private TextField age_text;

    @FXML
    private Button nextBut;

    DataController data = DataController.getDataC();

    @FXML
    void ageBut(ActionEvent event) {
        //variant
        data.setAge(age_text.getText());

        Alert al = new Alert(Alert.AlertType.CONFIRMATION);
        al.setTitle("!!!");
        al.setContentText("Okay, mr. " + data.getName() + "." + data.getAge() + ". I remember this");
        al.show();
    }

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
