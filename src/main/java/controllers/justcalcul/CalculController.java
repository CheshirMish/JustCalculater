package controllers.justcalcul;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class CalculController {

    @FXML
    private TextField ansText;

    @FXML
    private Button delBut;

    @FXML
    private Button divBut;

    @FXML
    private Button eightBut;

    @FXML
    private Button equalBut;

    @FXML
    private Button fiveBut;

    @FXML
    private Button fourBut;

    @FXML
    private Button minusBut;

    @FXML
    private Button mulBut;

    @FXML
    private Button nineBut;

    @FXML
    private Button oneBut;

    @FXML
    private Button plusBut;

    @FXML
    private Button sevenBut;

    @FXML
    private Button sixBut;

    @FXML
    private Button threeBut;

    @FXML
    private Button twoBut;

    @FXML
    private Button zeroBut;

    @FXML
    private Text savedNumber;

    private String firstNum = "";
    private String currentNum = "";
    private String calculType;

    private void addNumber(String number){
        currentNum += number;
        updateTextField();
    }

    public void updateTextField(){
        ansText.setText(currentNum);
    }

    public void setCalculType(String calculType){
        this.calculType = calculType;
        firstNum = currentNum;
        currentNum = "";
        savedNumber.setText(firstNum + " " + calculType);
    }


    @FXML
    void divButAct(ActionEvent event) {
        setCalculType("/");
    }

    @FXML
    void minusButAct(ActionEvent event) {
        setCalculType("-");
    }

    @FXML
    void mulButAct(ActionEvent event) {
        setCalculType("*");
    }

    @FXML
    void plusButAct(ActionEvent event) {
        setCalculType("+");
    }

    @FXML
    void delButClick(ActionEvent event) {
        currentNum = "";
        savedNumber.setText("");
        ansText.setText("");
    }

    @FXML
    void equalButAct(ActionEvent event) {
        int firstNumInt = Integer.parseInt(firstNum);
        int secondNumInt = Integer.parseInt(currentNum);

        switch (calculType){
            case "+" -> {
                int ansNum = firstNumInt + secondNumInt;
                savedNumber.setText(firstNum + calculType + currentNum + " " + "=" + " " + ansNum);
                ansText.setText(String.valueOf(ansNum));
            }
            case "-" -> {
                int ansNum = firstNumInt - secondNumInt;
                savedNumber.setText(firstNum + calculType + currentNum + " " + "=" + " " + ansNum);
                ansText.setText(String.valueOf(ansNum));
            }
            case "*" -> {
                int ansNum = firstNumInt * secondNumInt;
                savedNumber.setText(firstNum + calculType + currentNum + " " + "=" + " " + ansNum);
                ansText.setText(String.valueOf(ansNum));
            }
            case "/" -> {
                int ansNum = firstNumInt / secondNumInt;
                savedNumber.setText(firstNum + calculType + currentNum + " " + "=" + " " + ansNum);
                ansText.setText(String.valueOf(ansNum));
            }
        }

    }

    @FXML
    void eightButClick(ActionEvent event) {addNumber("8");}

    @FXML
    void fiveButClick(ActionEvent event) {addNumber("5");}

    @FXML
    void fourButClick(ActionEvent event) {addNumber("4");}

    @FXML
    void nineButClick(ActionEvent event) {addNumber("9");}

    @FXML
    void oneButClick(ActionEvent event) {addNumber("1");}

    @FXML
    void sevenButClick(ActionEvent event) {addNumber("7");}

    @FXML
    void sixButClick(ActionEvent event) {addNumber("6");}

    @FXML
    void threeButClick(ActionEvent event) {addNumber("3");}

    @FXML
    void twoButClick(ActionEvent event) {addNumber("2");}

    @FXML
    void zeroButClick(ActionEvent event) {
        if(!currentNum.equals("")){
            addNumber("0");
        }
    }

}