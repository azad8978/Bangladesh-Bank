package com.spring26.section2.group17.bangladeshbank.Towhid.CyberSecurityOfficer;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;

public class ReviewSecurityAlertsController {

    @FXML
    private TableColumn<Object[], String> severityColumn;
    @FXML
    private TextField alertTypeField;
    @FXML
    private TextArea notesArea;
    @FXML
    private RadioButton highRadio;
    @FXML
    private TableColumn<Object[], String> typeColumn;
    @FXML
    private TableView<Object[]> alertsTable;
    @FXML
    private TableColumn<Object[], String> timeColumn;
    @FXML
    private RadioButton lowRadio;
    @FXML
    private TextField timestampField;
    @FXML
    private TableColumn<Object[], String> alertIdColumn;
    @FXML
    private RadioButton mediumRadio;
    @FXML
    private TextField alertIdField;
    @FXML
    private ToggleGroup severityGroup;

    // data storage (no model class)
    private ObservableList<Object[]> tableData;

    @FXML
    public void initialize() {

        // Step 1: create ArrayList with dummy data
        ArrayList<Object[]> list = new ArrayList<>();

        list.add(new Object[]{"A101", "Login Failure", "2026-04-11 10:30", "High"});
        list.add(new Object[]{"A102", "Suspicious IP", "2026-04-11 11:00", "Medium"});
        list.add(new Object[]{"A103", "Multiple Attempts", "2026-04-11 11:30", "Low"});
        list.add(new Object[]{"A104", "Firewall Alert", "2026-04-11 12:00", "High"});

        // Step 2: convert to ObservableList
        tableData = FXCollections.observableArrayList(list);

        // Step 3: bind columns
        alertIdColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue()[0].toString()));

        typeColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue()[1].toString()));

        timeColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue()[2].toString()));

        severityColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue()[3].toString()));

        // Step 4: set table data
        alertsTable.setItems(tableData);
    }

    @FXML
    public void ButtonOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/CyberSecurityOfficer/DashboardCSO.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void markasreview(ActionEvent actionEvent) {
        Object[] selected = alertsTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            notesArea.setText("Reviewed Alert: " + selected[0]);
        }
    }

    @FXML
    public void viewdetails(ActionEvent actionEvent) {
        Object[] selected = alertsTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            alertIdField.setText(selected[0].toString());
            alertTypeField.setText(selected[1].toString());
            timestampField.setText(selected[2].toString());
        }
    }

    @FXML
    public void clear(ActionEvent actionEvent) {
        alertIdField.clear();
        alertTypeField.clear();
        timestampField.clear();
        notesArea.clear();
        alertsTable.getSelectionModel().clearSelection();
    }
}