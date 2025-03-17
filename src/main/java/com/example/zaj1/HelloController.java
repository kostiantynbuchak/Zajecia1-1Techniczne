package com.example.zaj1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField num1Field, num2Field, textInputField;

    @FXML
    private Label calcResultLabel, textResultLabel;

    @FXML
    private void add() { calculate('+'); }

    @FXML
    private void subtract() { calculate('-'); }

    @FXML
    private void multiply() { calculate('*'); }

    @FXML
    private void divide() { calculate('/'); }

    private void calculate(char operator) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;

            switch (operator) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/':
                    if (num2 == 0) {
                        calcResultLabel.setText("Błąd: Dzielenie przez zero!");
                        return;
                    }
                    result = num1 / num2;
                    break;
            }
            calcResultLabel.setText("Wynik: " + result);
        } catch (NumberFormatException e) {
            calcResultLabel.setText("Błąd: Wprowadź liczby!");
        }
    }

    @FXML
    private void analyzeText() {
        String text = textInputField.getText().trim();
        int charCount = text.length();
        int wordCount = text.isEmpty() ? 0 : text.split("\\s+").length;
        textResultLabel.setText("Znaki: " + charCount + " | Słowa: " + wordCount);
    }
}
