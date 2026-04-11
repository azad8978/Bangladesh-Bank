package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MonitoringCrossBorderTradePaymentsController {



    @FXML private Label statusLabel;

    @FXML private TextField lcField;
    @FXML private TextField invoiceField;
    @FXML private TextField exporterField;
    @FXML private TextField importerField;
    @FXML private TextField amountField;

    @FXML private CheckBox invoiceCheck;
    @FXML private CheckBox shipmentCheck;

    @FXML private Button btnEnterPortal;
    @FXML private Button btnSubmit;
    @FXML private Button btnVerify;

    @FXML private TableView<TradeRecord> historyTable;

    @FXML private TableColumn<TradeRecord, String> colLC;
    @FXML private TableColumn<TradeRecord, String> colInvoice;
    @FXML private TableColumn<TradeRecord, String> colExporter;
    @FXML private TableColumn<TradeRecord, String> colImporter;
    @FXML private TableColumn<TradeRecord, String> colStatus;


    private ObservableList<TradeRecord> records = FXCollections.observableArrayList();



    @FXML
    public void initialize() {

        colLC.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getLc()));
        colInvoice.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getInvoice()));
        colExporter.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getExporter()));
        colImporter.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getImporter()));
        colStatus.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getStatus()));

        historyTable.setItems(records);

        statusLabel.setText("System Ready...");
    }



    @FXML
    private void handleEnterPortal() {
        showAlert("Access Granted", "Welcome to Trade FX Monitoring System");
        statusLabel.setText("Portal Accessed");
    }



    @FXML
    private void handleSubmit() {

        if (!isInputValid()) return;

        showAlert("Success", "Trade data submitted");
        statusLabel.setText("Data Submitted");
    }



    @FXML
    private void handleVerify() {

        if (!invoiceCheck.isSelected() || !shipmentCheck.isSelected()) {
            statusLabel.setText("Verification Failed ❌");
            showAlert("Error", "All documents must be verified");
            return;
        }

        statusLabel.setText("Verified ✔");

        // Save to history after verification
        records.add(new TradeRecord(
                lcField.getText(),
                invoiceField.getText(),
                exporterField.getText(),
                importerField.getText(),
                "Approved"
        ));

        clearFields();
    }



    private boolean isInputValid() {

        if (lcField.getText().isEmpty() ||
                invoiceField.getText().isEmpty() ||
                exporterField.getText().isEmpty() ||
                importerField.getText().isEmpty() ||
                amountField.getText().isEmpty()) {

            showAlert("Missing Data", "Fill all fields");
            return false;
        }

        try {
            double amount = Double.parseDouble(amountField.getText());

            if (amount <= 0) {
                showAlert("Invalid Amount", "Amount must be positive");
                return false;
            }

        } catch (NumberFormatException e) {
            showAlert("Error", "Amount must be a number");
            return false;
        }

        return true;
    }



    private void clearFields() {
        lcField.clear();
        invoiceField.clear();
        exporterField.clear();
        importerField.clear();
        amountField.clear();
        invoiceCheck.setSelected(false);
        shipmentCheck.setSelected(false);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.show();
    }
}