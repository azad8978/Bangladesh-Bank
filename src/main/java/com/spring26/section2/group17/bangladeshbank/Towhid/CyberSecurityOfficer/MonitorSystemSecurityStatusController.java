package com.spring26.section2.group17.bangladeshbank.Towhid.CyberSecurityOfficer;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class MonitorSystemSecurityStatusController
{
    @javafx.fxml.FXML
    private ComboBox customRangeBox;
    @javafx.fxml.FXML
    private RadioButton weekRadio;
    @javafx.fxml.FXML
    private RadioButton monthRadio;
    @javafx.fxml.FXML
    private TextField threatLevelField;
    @javafx.fxml.FXML
    private TextField alertsField;
    @javafx.fxml.FXML
    private RadioButton todayRadio;
    @javafx.fxml.FXML
    private TextArea dashboardArea;
    @javafx.fxml.FXML
    private ComboBox healthComboBox;
    @javafx.fxml.FXML
    private ToggleGroup timeGroup;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ButtonOA(ActionEvent actionEvent) {
        try{
            SceneSwitcher.switchTo("Towhid/CyberSecurityOfficer/DashboardCSO.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void update(ActionEvent actionEvent) {
    }
}