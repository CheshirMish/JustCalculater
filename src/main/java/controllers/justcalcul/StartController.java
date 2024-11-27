package controllers.justcalcul;

import com.sun.tools.javac.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.controlsfx.control.tableview2.filter.parser.Parser;

import java.io.IOException;

public class StartController {

    @FXML
    private Button nameBut;

    @FXML
    private TextField nameText;

    @FXML
    private Button noBut;

    @FXML
    private Button yesBut;

    DataController data = DataController.getDataC();

    @FXML
    void ansNo() throws IOException {

        Stage stage = (Stage) nameBut.getScene().getWindow();
        stage.close();

        Stage primaryStage = new Stage();

        Parent root = FXMLLoader.load(MainApplication.class.getResource("ans-no-view.fxml"));
        primaryStage.setTitle("JustCevin");
        primaryStage.setScene(new Scene(root, 420, 280));
        primaryStage.show();

    }

    @FXML
    public void ansYes() throws IOException {

        Stage stage = (Stage) nameBut.getScene().getWindow();
        stage.close();

        Stage primaryStage = new Stage();

        Parent root = FXMLLoader.load(MainApplication.class.getResource("ans-yes-view.fxml"));
        primaryStage.setTitle("JustCevin");
        primaryStage.setScene(new Scene(root, 420, 280));
        primaryStage.show();

    }

    @FXML
    void setName(ActionEvent event) {
        // if "no name"
        data.setName(nameText.getText());

        if(data.getName().equals(" "))
        {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("!");
            alert.setContentText("Tell");
            alert.show();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("!");
            alert.setContentText("Hi, mr. " + data.getName() + "! Nice to \"see\" you tonight!");
            alert.show();
        }

    }

}