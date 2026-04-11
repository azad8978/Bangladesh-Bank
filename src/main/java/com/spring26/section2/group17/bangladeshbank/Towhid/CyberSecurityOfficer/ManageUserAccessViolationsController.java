package com.spring26.section2.group17.bangladeshbank.Towhid.CyberSecurityOfficer;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;

public class ManageUserAccessViolationsController {

    @FXML
    private ComboBox<String> durationComboBox;

    @FXML
    private TextArea notesArea;

    @FXML
    private TableView<Object[]> violationTable;

    @FXML
    private TableColumn<Object[], String> userIdColumn;

    @FXML
    private TableColumn<Object[], String> violationTypeColumn;

    @FXML
    private TableColumn<Object[], String> dateColumn;

    @FXML
    private TextField userIdField;

    @FXML
    private RadioButton permanentRadio;

    @FXML
    private PasswordField passwordField;

    @FXML
    private RadioButton temporaryRadio;

    @FXML
    private ToggleGroup restrictionGroup;

    private ObservableList<Object[]> violationList;


    @FXML
    public void initialize() {


        ArrayList<Object[]> list = new ArrayList<>();

        list.add(new Object[]{"U101", "Multiple Login Failures", "2026-04-10"});
        list.add(new Object[]{"U102", "Unauthorized Access Attempt", "2026-04-09"});
        list.add(new Object[]{"U103", "Suspicious File Download", "2026-04-08"});
        list.add(new Object[]{"U104", "Password Sharing Violation", "2026-04-07"});
        list.add(new Object[]{"U105", "Admin Privilege Abuse", "2026-04-06"});

        violationList = FXCollections.observableArrayList(list);


        userIdColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue()[0].toString()));

        violationTypeColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue()[1].toString()));

        dateColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue()[2].toString()));

        violationTable.setItems(violationList);


        durationComboBox.setItems(FXCollections.observableArrayList(
                "1 Day",
                "7 Days",
                "30 Days",
                "Permanent"
        ));


        violationTable.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                notesArea.setText("Selected User: " + newVal[0]);
            }
        });
    }

    @FXML
    public void applyrestriction(ActionEvent actionEvent) {

        Object[] selected = violationTable.getSelectionModel().getSelectedItem();

        if (selected == null) {
            showAlert("No Selection", "Please select a violation first!");
            return;
        }

        String duration = durationComboBox.getValue();

        if (duration == null) {
            showAlert("Missing Input", "Please select restriction duration!");
            return;
        }

        notesArea.setText(
                "✅ Restriction Applied\n\n" +
                        "User ID: " + selected[0] + "\n" +
                        "Violation: " + selected[1] + "\n" +
                        "Date: " + selected[2] + "\n" +
                        "Duration: " + duration
        );
    }


    @FXML
    public void restrictaccess(ActionEvent actionEvent) {

        Object[] selected = violationTable.getSelectionModel().getSelectedItem();

        if (selected == null) {
            showAlert("No Selection", "Select a violation to restrict access!");
            return;
        }

        notesArea.setText("🚫 Access Restricted for User: " + selected[0]);
    }


    @FXML
    public void clear(ActionEvent actionEvent) {
        userIdField.clear();
        notesArea.clear();
        durationComboBox.getSelectionModel().clearSelection();
        violationTable.getSelectionModel().clearSelection();
    }


    @FXML
    public void ButtonOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/CyberSecurityOfficer/DashboardCSO.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}