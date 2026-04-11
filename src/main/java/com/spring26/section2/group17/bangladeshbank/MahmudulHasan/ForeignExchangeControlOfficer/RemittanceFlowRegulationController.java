package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class RemittanceFlowRegulationController {

    @FXML private TableColumn<RemittanceRecord, String> colSender;
    @FXML private TableColumn<RemittanceRecord, String> colReceiver;
    @FXML private TableColumn<RemittanceRecord, Double> colAmount;
    @FXML private TableColumn<RemittanceRecord, String> colStatus;

    @FXML private ProgressBar statusBarProgress;

    @FXML private CheckBox sourceCheck;

    @FXML private Label statusLabel;
    @FXML private Label verifyLabel;

    @FXML private TextField amountField;
    @FXML private TextField senderField;
    @FXML private TextField receiverField;

    @FXML private Button btnOpenPortal;
    @FXML private Button btnSubmit;
    @FXML private Button btnVerify;

    @FXML private TableView<RemittanceRecord> remittanceTable;

    private ObservableList<RemittanceRecord> data = FXCollections.observableArrayList();

    private boolean verified = false;

    @FXML
    public void initialize() {

        colSender.setCellValueFactory(new PropertyValueFactory<>("sender"));
        colReceiver.setCellValueFactory(new PropertyValueFactory<>("receiver"));
        colAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        remittanceTable.setItems(data);

        statusLabel.setText("Not Processed");
        verifyLabel.setText("Pending");

        btnOpenPortal.setOnAction(e -> openPortal());
        btnSubmit.setOnAction(e -> submitData());
        btnVerify.setOnAction(e -> verifySource());
    }

    // EVENT 1
    private void openPortal() {
        statusLabel.setText("Portal Active");
        statusBarProgress.setProgress(0.2);
    }

    // EVENT 3
    private void verifySource() {

        if (sourceCheck.isSelected()) {
            verified = true;
            verifyLabel.setText("Verified ✔");
            statusBarProgress.setProgress(0.6);
        } else {
            verified = false;
            verifyLabel.setText("Suspicious ❌");
            statusBarProgress.setProgress(0.3);
        }
    }

    // EVENT 2 + 4
    private void submitData() {

        if (senderField.getText().isEmpty() ||
                receiverField.getText().isEmpty() ||
                amountField.getText().isEmpty()) {

            statusLabel.setText("Missing Data ❌");
            return;
        }

        double amount;

        try {
            amount = Double.parseDouble(amountField.getText());
        } catch (Exception e) {
            statusLabel.setText("Invalid Amount ❌");
            return;
        }

        String status;

        if (!verified) {
            status = "Blocked ❌";
            statusBarProgress.setProgress(0.2);
        } else if (amount > 10000) {
            status = "High Value Review ⚠";
            statusBarProgress.setProgress(0.8);
        } else {
            status = "Approved ✔";
            statusBarProgress.setProgress(1.0);
        }

        RemittanceRecord record = new RemittanceRecord(
                senderField.getText(),
                receiverField.getText(),
                amount,
                status
        );

        data.add(record);

        statusLabel.setText(status);

        clearFields();
    }

    private void clearFields() {
        senderField.clear();
        receiverField.clear();
        amountField.clear();
        sourceCheck.setSelected(false);
        verified = false;
        verifyLabel.setText("Pending");
    }
}