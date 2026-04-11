package com.spring26.section2.group17.bangladeshbank.Towhid.DataAnalyst;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;

public class VisualizeAnalyticalDataController
{
    @javafx.fxml.FXML
    private Button visualizeButton;
    @javafx.fxml.FXML
    private RadioButton barChartRadio;
    @javafx.fxml.FXML
    private RadioButton pieChartRadio;
    @javafx.fxml.FXML
    private ComboBox datasetComboBox;
    @javafx.fxml.FXML
    private Pane chartPane;
    @javafx.fxml.FXML
    private Button renderButton;
    @javafx.fxml.FXML
    private RadioButton lineChartRadio;
    @javafx.fxml.FXML
    private ToggleGroup chartGroup;

    @javafx.fxml.FXML
    public void initialize() {
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