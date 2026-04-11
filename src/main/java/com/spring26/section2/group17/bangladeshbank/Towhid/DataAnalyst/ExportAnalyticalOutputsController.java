package com.spring26.section2.group17.bangladeshbank.Towhid.DataAnalyst;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class ExportAnalyticalOutputsController
{
    @javafx.fxml.FXML
    private TextArea statusArea;
    @javafx.fxml.FXML
    private ToggleGroup formatGroup;
    @javafx.fxml.FXML
    private RadioButton csvRadio;
    @javafx.fxml.FXML
    private ComboBox<String> resultComboBox;
    @javafx.fxml.FXML
    private RadioButton pdfRadio;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ExportbuttonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ButtonOA(ActionEvent actionEvent) {

        try{
            SceneSwitcher.switchTo("Towhid/DataAnalyst/DashboardDA.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}