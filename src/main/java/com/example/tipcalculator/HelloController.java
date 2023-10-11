package com.example.tipcalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label TipPercentLabel;

    @FXML
    private Slider TipPercentSlider;

    @FXML
    private TextField AmountTextField;

    @FXML
    private TextField TipTextField;

    @FXML
    private TextField TotalTextField;

    @FXML
    protected void PercentSliderDragged() {
        TipPercentLabel.setText(String.valueOf(((int)(TipPercentSlider.getValue()*100)/100)+"% "));
        double tipPercent = TipPercentSlider.getValue();
        double amt = Double.parseDouble(AmountTextField.getText());

        TipTextField.setText(String.valueOf(((int)((tipPercent/100)*amt)*100)/100));
        TotalTextField.setText(String.valueOf(Double.parseDouble(AmountTextField.getText())+Double.parseDouble(TipTextField.getText())));

    }
}