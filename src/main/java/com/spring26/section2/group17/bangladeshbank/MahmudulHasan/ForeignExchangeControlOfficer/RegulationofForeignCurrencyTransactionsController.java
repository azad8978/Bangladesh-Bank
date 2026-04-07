package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RegulationofForeignCurrencyTransactionsController
{
    @javafx.fxml.FXML
    private TableColumn colReceiver;
    @javafx.fxml.FXML
    private TableColumn colAmount;
    @javafx.fxml.FXML
    private TableView transactionTable;
    @javafx.fxml.FXML
    private TextField receiverField;
    @javafx.fxml.FXML
    private TableColumn colPurpose;
    @javafx.fxml.FXML
    private TextField senderField;
    @javafx.fxml.FXML
    private TableColumn colSender;
    @javafx.fxml.FXML
    private TextField purposeField;
    @javafx.fxml.FXML
    private TextField amountField;
    @javafx.fxml.FXML
    private TableColumn colStatus;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleSave(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleValidate(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleReject(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleApprove(ActionEvent actionEvent) {
    }
}