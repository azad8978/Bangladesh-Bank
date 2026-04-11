package com.spring26.section2.group17.bangladeshbank.Towhid.CyberSecurityOfficer;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ReviewSystemLogsController
{
    @javafx.fxml.FXML
    private TextField sourceField;
    @javafx.fxml.FXML
    private TextArea statusArea;
    @javafx.fxml.FXML
    private ComboBox<String> logTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TableView logTable;
    @javafx.fxml.FXML
    private TableColumn sourceSL;
    @javafx.fxml.FXML
    private TableColumn loginSL;
    @javafx.fxml.FXML
    private TableColumn actionSL;
    @javafx.fxml.FXML
    private TableColumn timeSL;

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
    public void applyfilter(ActionEvent actionEvent) {
    }
}