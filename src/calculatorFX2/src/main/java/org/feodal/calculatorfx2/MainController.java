package org.feodal.calculatorfx2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button clear_btn;

    @FXML
    private Button divide_btn;

    @FXML
    private Button equal_btn;

    @FXML
    private Label label_res;

    @FXML
    private Button minus_btn;

    @FXML
    private Button minus_plus_btn;

    @FXML
    private Button multy_btn;

    @FXML
    private Button percent_btn;

    @FXML
    private Button plus_btn;

    @FXML
    private Button comma_btn;

    String labelText = "";
    float firstNum = 0f;
    char operation = '0';
    boolean secondInput = false;

    @FXML
    void addNumber(ActionEvent event) {
        if(!(((Button) event.getSource()).getText().equals("0") && label_res.getText().equals("0"))){
            labelText += ((Button) event.getSource()).getText();
            label_res.setText(labelText);
        }

    }

    @FXML
    void initialize() {
        plus_btn.setOnAction(event -> mathAction('+'));
        minus_btn.setOnAction(event -> mathAction('-'));
        multy_btn.setOnAction(event -> mathAction('*'));
        divide_btn.setOnAction(event -> mathAction('/'));

        equal_btn.setOnAction(event -> {
            if (operation != '0') equalBtn();
        });

        comma_btn.setOnAction(event -> {
            if (!labelText.contains(".")) {
                labelText += ".";
                label_res.setText(labelText);
            }
        });

        percent_btn.setOnAction(event -> {
            if (!labelText.equals("")) {
                float num = Float.parseFloat(labelText) * 0.01f;
                labelText = formatResult(num);
                label_res.setText(labelText);
            }
        });

        minus_plus_btn.setOnAction(event -> {
            if (!labelText.equals("")) {
                float num = Float.parseFloat(labelText) * -1f;
                labelText = formatResult(num);
                label_res.setText(labelText);
            }
        });

        clear_btn.setOnAction(event -> {
            labelText = "";
            label_res.setText("0");
            firstNum = 0f;
            operation = '0';
            secondInput = false;
        });
    }

    private void equalBtn() {
        if (operation == '0' || labelText.equals("")) return;

        float secondNum = Float.parseFloat(labelText);
        float result = calculate(firstNum, secondNum, operation);

        labelText = formatResult(result);
        label_res.setText(labelText);
        firstNum = result;
        secondInput = false;
    }

    private void mathAction(char action) {
        if (!labelText.equals("")) {
            if (operation != '0') {
                equalBtn();
            } else {
                firstNum = Float.parseFloat(labelText);
            }
        }
        operation = action;
        label_res.setText(String.valueOf(action));
        labelText = "";
    }

    private float calculate(float num1, float num2, char op) {
        switch (op) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return (num2 != 0) ? num1 / num2 : 0;
            default: return num2;
        }
    }

    private String formatResult(float number) {
        if(number == (int) number) {
            return String.valueOf((int) number);
        } else {
            return String.valueOf(number);
        }
    }
}
