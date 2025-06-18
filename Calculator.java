package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {

    private TextField display;

    private double firstNumber = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    @Override
    public void start(Stage primaryStage) {
        display = new TextField();
        display.setPrefHeight(50);
        display.setAlignment(Pos.CENTER_RIGHT);
        display.setEditable(false);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setAlignment(Pos.CENTER);

        // Add display at top
        grid.add(display, 0, 0, 4, 1);

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        int row = 1;
        int col = 0;
        for (String label : buttonLabels) {
            Button btn = new Button(label);
            btn.setPrefSize(50, 50);
            btn.setOnAction(e -> buttonClicked(label));
            grid.add(btn, col, row);
            col++;
            if (col > 3) {
                col = 0;
                row++;
            }
        }

        Scene scene = new Scene(grid, 240, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Simple Calculator");
        primaryStage.show();
    }

    private void buttonClicked(String label) {
        if ("0123456789.".contains(label)) {
            if (startNewNumber) {
                display.clear();
                startNewNumber = false;
            }
            if (label.equals(".") && display.getText().contains(".")) {
                // Avoid multiple dots
                return;
            }
            display.appendText(label);
        } else if (label.equals("=")) {
            if (!operator.isEmpty()) {
                calculate();
                operator = "";
            }
        } else {
            // Operator pressed
            if (!display.getText().isEmpty()) {
                if (!operator.isEmpty()) {
                    calculate();
                } else {
                    firstNumber = Double.parseDouble(display.getText());
                }
                operator = label;
                startNewNumber = true;
            }
        }
    }

    private void calculate() {
        double secondNumber = 0;
        try {
            secondNumber = Double.parseDouble(display.getText());
        } catch (NumberFormatException e) {
            display.setText("Error");
            return;
        }

        double result = 0;
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    display.setText("Error: /0");
                    startNewNumber = true;
                    return;
                }
                result = firstNumber / secondNumber;
                break;
        }
        display.setText(String.valueOf(result));
        firstNumber = result;
        startNewNumber = true;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
