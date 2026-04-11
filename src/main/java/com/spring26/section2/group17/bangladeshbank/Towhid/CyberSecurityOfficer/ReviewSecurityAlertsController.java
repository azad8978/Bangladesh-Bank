package com.spring26.section2.group17.bangladeshbank.Towhid.CyberSecurityOfficer;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ReviewSecurityAlertsController
{
    @javafx.fxml.FXML
    private TableColumn severityColumn;
    @javafx.fxml.FXML
    private TextField alertTypeField;
    @javafx.fxml.FXML
    private TextArea notesArea;
    @javafx.fxml.FXML
    private RadioButton highRadio;
    @javafx.fxml.FXML
    private TableColumn typeColumn;
    @javafx.fxml.FXML
    private TableView alertsTable;
    @javafx.fxml.FXML
    private TableColumn timeColumn;
    @javafx.fxml.FXML
    private RadioButton lowRadio;
    @javafx.fxml.FXML
    private TextField timestampField;
    @javafx.fxml.FXML
    private TableColumn alertIdColumn;
    @javafx.fxml.FXML
    private RadioButton mediumRadio;
    @javafx.fxml.FXML
    private TextField alertIdField;
    @javafx.fxml.FXML
    private ToggleGroup severityGroup;

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
    public void markasreview(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewdetails(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void clear(ActionEvent actionEvent) {
    }
}