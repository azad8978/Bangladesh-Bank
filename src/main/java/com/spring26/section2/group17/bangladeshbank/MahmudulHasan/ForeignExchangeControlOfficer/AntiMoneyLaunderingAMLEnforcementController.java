package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;


import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AntiMoneyLaunderingAMLEnforcementController {

    // ================= UI =================

    @FXML private TextField accountField;
    @FXML private TextField transactionField;
    @FXML private TextField amountField;
    @FXML private TextField countryField;

    @FXML private Label riskScoreLabel;
    @FXML private Label alertLabel;
    @FXML private ProgressIndicator riskIndicator;

    @FXML private TableView<AMLRecord> caseTable;

    @FXML private TableColumn<AMLRecord, String> colAccount;
    @FXML private TableColumn<AMLRecord, String> colTxn;
    @FXML private TableColumn<AMLRecord, Double> colAmount;
    @FXML private TableColumn<AMLRecord, Double> colRisk;

    @FXML private Button btnStart;
    @FXML private Button btnSubmit;
    @FXML private Button btnAnalyze;

    // ================= DATA =================

    private ObservableList<AMLRecord> records = FXCollections.observableArrayList();

    private double currentRisk = 0;

    // ================= INITIALIZE =================

    @FXML
    public void initialize() {

        colAccount.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getAccount()));
        colTxn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getTxn()));
        colAmount.setCellValueFactory(data -> new SimpleDoubleProperty(data.getValue().getAmount()).asObject());
        colRisk.setCellValueFactory(data -> new SimpleDoubleProperty(data.getValue().getRisk()).asObject());

        caseTable.setItems(records);

        riskIndicator.setProgress(0);
        riskScoreLabel.setText("Risk Score: 0.0");
        alertLabel.setText("System idle...");
    }

    // ================= EVENT 1 =================

    @FXML
    private void handleStart() {
        showAlert("System Started", "AML Surveillance Activated");
        alertLabel.setText("Monitoring active...");
    }

    // ================= EVENT 2 =================

    @FXML
    private void handleSubmit() {

        if (!isValidInput()) return;

        showAlert("Submitted", "Transaction captured for analysis");
    }

    // ================= EVENT 3 =================

    @FXML
    private void handleAnalyze() {

        if (!isValidInput()) return;

        double amount = Double.parseDouble(amountField.getText());
        String country = countryField.getText().toLowerCase();
        String txn = transactionField.getText();

        currentRisk = 0.1; // base

        if (amount > 100000) currentRisk += 0.4;
        if (!country.contains("bangladesh")) currentRisk += 0.3;
        if (txn.length() < 5) currentRisk += 0.2;

        if (currentRisk > 1.0) currentRisk = 1.0;

        // UI UPDATE
        riskIndicator.setProgress(currentRisk);
        riskScoreLabel.setText(String.format("Risk Score: %.2f", currentRisk));

        updateAlert();

        // SAVE CASE
        records.add(new AMLRecord(
                accountField.getText(),
                transactionField.getText(),
                amount,
                currentRisk
        ));

        clearFields();
    }

    // ================= ALERT ENGINE =================

    private void updateAlert() {

        if (currentRisk >= 0.7) {
            alertLabel.setText("🚨 HIGH RISK! Immediate Investigation Required");
        } else if (currentRisk >= 0.4) {
            alertLabel.setText("⚠ Medium Risk - Monitor closely");
        } else {
            alertLabel.setText("✔ Low Risk");
        }
    }

    // ================= VALIDATION =================

    private boolean isValidInput() {

        if (accountField.getText().isEmpty() ||
                transactionField.getText().isEmpty() ||
                amountField.getText().isEmpty() ||
                countryField.getText().isEmpty()) {

            showAlert("Missing Data", "Fill all fields");
            return false;
        }

        try {
            double amount = Double.parseDouble(amountField.getText());

            if (amount <= 0) {
                showAlert("Invalid Amount", "Amount must be positive");
                return false;
            }

        } catch (Exception e) {
            showAlert("Error", "Amount must be numeric");
            return false;
        }

        return true;
    }

    // ================= UTIL =================

    private void clearFields() {
        accountField.clear();
        transactionField.clear();
        amountField.clear();
        countryField.clear();
    }

    private void showAlert(String title, String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(msg);
        alert.show();
    }
}