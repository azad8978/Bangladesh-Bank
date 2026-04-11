package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class SupervisionofAuthorizedDealerADBanksController {



    @FXML private TextField bankNameField;
    @FXML private TextField licenseField;
    @FXML private TextField transactionVolumeField;
    @FXML private TextField reportField;

    @FXML private CheckBox licenseCheck;
    @FXML private CheckBox regulationCheck;

    @FXML private Label statusLabel;

    @FXML private TableView<ADBankRecord> reportTable;

    @FXML private TableColumn<ADBankRecord, String> colBank;
    @FXML private TableColumn<ADBankRecord, String> colLicense;
    @FXML private TableColumn<ADBankRecord, Double> colVolume;
    @FXML private TableColumn<ADBankRecord, String> colStatus;

    @FXML private Button btnOpenPortal;
    @FXML private Button btnSubmit;
    @FXML private Button btnVerify;



    private ObservableList<ADBankRecord> records = FXCollections.observableArrayList();

    private String currentStatus = "Pending";



    @FXML
    public void initialize() {

        colBank.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getBank()));
        colLicense.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getLicense()));
        colVolume.setCellValueFactory(data -> new SimpleDoubleProperty(data.getValue().getVolume()).asObject());
        colStatus.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getStatus()));

        reportTable.setItems(records);

        statusLabel.setText("Pending");
    }



    @FXML
    private void handleOpenPortal() {
        showAlert("Portal Access", "AD Bank Supervision Activated");
        statusLabel.setText("Module Active");
    }



    @FXML
    private void handleSubmit() {

        if (!isValidInput()) return;

        showAlert("Submitted", "Bank data recorded");
        statusLabel.setText("Data Submitted");
    }



    @FXML
    private void handleVerify() {

        if (!isValidInput()) return;

        double volume = Double.parseDouble(transactionVolumeField.getText());


        if (licenseCheck.isSelected() && regulationCheck.isSelected()) {
            currentStatus = "Compliant ✔";
        } else if (licenseCheck.isSelected() || regulationCheck.isSelected()) {
            currentStatus = "Partial ⚠";
        } else {
            currentStatus = "Non-Compliant ❌";
        }


        if (volume > 1000000) {
            currentStatus += " | High Volume 🔍";
        }

        statusLabel.setText(currentStatus);


        records.add(new ADBankRecord(
                bankNameField.getText(),
                licenseField.getText(),
                volume,
                currentStatus
        ));

        clearFields();
    }



    private boolean isValidInput() {

        if (bankNameField.getText().isEmpty() ||
                licenseField.getText().isEmpty() ||
                transactionVolumeField.getText().isEmpty()) {

            showAlert("Missing Data", "Fill required fields");
            return false;
        }

        try {
            double volume = Double.parseDouble(transactionVolumeField.getText());

            if (volume < 0) {
                showAlert("Invalid Volume", "Volume must be positive");
                return false;
            }

        } catch (Exception e) {
            showAlert("Error", "Volume must be numeric");
            return false;
        }

        return true;
    }



    private void clearFields() {
        bankNameField.clear();
        licenseField.clear();
        transactionVolumeField.clear();
        reportField.clear();
        licenseCheck.setSelected(false);
        regulationCheck.setSelected(false);
    }

    private void showAlert(String title, String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(msg);
        alert.show();
    }
}