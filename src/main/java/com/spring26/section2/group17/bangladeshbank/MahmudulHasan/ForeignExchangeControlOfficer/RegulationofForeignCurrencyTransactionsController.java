package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RegulationofForeignCurrencyTransactionsController {

    // ================= UI COMPONENTS =================

    @FXML private TextField senderField;
    @FXML private TextField receiverField;
    @FXML private TextField amountField;
    @FXML private TextField purposeField;

    @FXML private TableView<Transaction> transactionTable;

    @FXML private TableColumn<Transaction, String> colSender;
    @FXML private TableColumn<Transaction, String> colReceiver;
    @FXML private TableColumn<Transaction, Double> colAmount;
    @FXML private TableColumn<Transaction, String> colPurpose;
    @FXML private TableColumn<Transaction, String> colStatus;

    // ================= DATA STORAGE =================

    private ObservableList<Transaction> transactions = FXCollections.observableArrayList();

    // ================= INITIALIZATION =================

    @FXML
    public void initialize() {

        colSender.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getSender()));
        colReceiver.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getReceiver()));
        colAmount.setCellValueFactory(data -> new SimpleObjectProperty<>(data.getValue().getAmount()));
        colPurpose.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getPurpose()));
        colStatus.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getStatus()));

        transactionTable.setItems(transactions);
    }

    // ================= BUTTON ACTIONS =================

    @FXML
    public void handleValidate(ActionEvent event) {

        if (!isInputValid()) return;

        double amount = Double.parseDouble(amountField.getText());

        if (amount <= 0 || amount > 1000000) {
            showAlert(Alert.AlertType.ERROR, "Invalid Transaction", "Amount must be between 1 and 1,000,000");
        } else {
            showAlert(Alert.AlertType.INFORMATION, "Validation Success", "Transaction is valid ✔");
        }
    }

    @FXML
    public void handleApprove(ActionEvent event) {
        addTransaction("Approved");
    }

    @FXML
    public void handleReject(ActionEvent event) {
        addTransaction("Rejected");
    }

    @FXML
    public void handleSave(ActionEvent event) {
        showAlert(Alert.AlertType.INFORMATION, "Saved", "Transaction saved successfully (Simulation)");
    }

    // ================= CORE LOGIC =================

    private void addTransaction(String status) {

        if (!isInputValid()) return;

        try {
            Transaction transaction = new Transaction(
                    senderField.getText(),
                    receiverField.getText(),
                    Double.parseDouble(amountField.getText()),
                    purposeField.getText(),
                    status
            );

            transactions.add(transaction);

            clearFields();

        } catch (Exception e) {
            showAlert(Alert.AlertType.ERROR, "Error", "Invalid input data!");
        }
    }

    // ================= VALIDATION =================

    private boolean isInputValid() {

        if (senderField.getText().isEmpty() ||
                receiverField.getText().isEmpty() ||
                amountField.getText().isEmpty() ||
                purposeField.getText().isEmpty()) {

            showAlert(Alert.AlertType.WARNING, "Missing Data", "Please fill all fields");
            return false;
        }

        try {
            Double.parseDouble(amountField.getText());
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Invalid Input", "Amount must be a number");
            return false;
        }

        return true;
    }

    // ================= UTILITIES =================

    private void clearFields() {
        senderField.clear();
        receiverField.clear();
        amountField.clear();
        purposeField.clear();
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.show();
    }
}