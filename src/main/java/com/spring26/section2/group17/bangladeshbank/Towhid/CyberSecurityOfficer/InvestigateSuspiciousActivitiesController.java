package com.spring26.section2.group17.bangladeshbank.Towhid.CyberSecurityOfficer;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.layout.HBox;

import java.util.ArrayList;

public class InvestigateSuspiciousActivitiesController {

    @FXML
    private TableView<Object[]> logsTable;

    @FXML
    private TableColumn<Object[], String> sourceColumn;

    @FXML
    private TableColumn<Object[], String> actionColumn;

    @FXML
    private TableColumn<Object[], String> timestampColumn;

    @FXML
    private TextArea notesArea;

    @FXML
    private RadioButton highRadio;

    @FXML
    private RadioButton mediumRadio;

    @FXML
    private RadioButton lowRadio;

    @FXML
    private ToggleGroup severityGroup;

    @FXML
    private ComboBox<String> categoryComboBox;

    @FXML
    private TextField investigatorField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private HBox severitylevel;


    private ObservableList<Object[]> logList;


    private ArrayList<String> investigationRecords;

    @FXML
    public void initialize() {

        investigationRecords = new ArrayList<>();


        ArrayList<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"192.168.1.1", "Login Attempt", "2026-04-11 10:00"});
        list.add(new Object[]{"10.0.0.5", "File Access", "2026-04-11 10:10"});
        list.add(new Object[]{"172.16.0.2", "Unauthorized Access", "2026-04-11 10:20"});
        list.add(new Object[]{"192.168.0.8", "Password Failure", "2026-04-11 10:30"});

        logList = FXCollections.observableArrayList(list);


        sourceColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue()[0].toString()));

        actionColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue()[1].toString()));

        timestampColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue()[2].toString()));

        logsTable.setItems(logList);


        categoryComboBox.getItems().addAll(
                "Network",
                "Application",
                "Database",
                "System"
        );
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
    public void investigate(ActionEvent actionEvent) {

        Object[] selectedLog = logsTable.getSelectionModel().getSelectedItem();

        if (selectedLog == null) {
            notesArea.setText("⚠ Please select a log first!");
            return;
        }

        notesArea.setText(
                "Source: " + selectedLog[0] +
                        "\nAction: " + selectedLog[1] +
                        "\nTimestamp: " + selectedLog[2] +
                        "\n\n➡ Write your investigation notes below..."
        );
    }

    @FXML
    public void savebutton(ActionEvent actionEvent) {

        Object[] selectedLog = logsTable.getSelectionModel().getSelectedItem();
        String notes = notesArea.getText();
        String investigator = investigatorField.getText();
        String category = categoryComboBox.getValue();

        Toggle selectedToggle = severityGroup.getSelectedToggle();

        if (selectedLog == null || notes.isEmpty() || investigator.isEmpty()
                || category == null || selectedToggle == null) {

            notesArea.setText("⚠ Fill all fields and select a log!");
            return;
        }

        String severity = ((RadioButton) selectedToggle).getText();

        String record =
                "Investigator: " + investigator +
                        "\nCategory: " + category +
                        "\nSeverity: " + severity +
                        "\n\nLog Details:" +
                        "\nSource: " + selectedLog[0] +
                        "\nAction: " + selectedLog[1] +
                        "\nTimestamp: " + selectedLog[2] +
                        "\n\nNotes: " + notes;

        investigationRecords.add(record);

        notesArea.setText("✅ Investigation Saved!\n\n" + record);


        investigatorField.clear();
        passwordField.clear();
        categoryComboBox.setValue(null);
        severityGroup.selectToggle(null);

        logsTable.refresh();
    }
}