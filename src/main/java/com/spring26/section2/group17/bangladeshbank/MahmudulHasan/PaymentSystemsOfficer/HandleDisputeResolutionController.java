package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.PaymentSystemsOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class HandleDisputeResolutionController
{
    @javafx.fxml.FXML
    private TextField txtTransactionId;
    @javafx.fxml.FXML
    private ComboBox cmbDisputeType;
    @javafx.fxml.FXML
    private DatePicker endDate;
    @javafx.fxml.FXML
    private TableView disputeTable;
    @javafx.fxml.FXML
    private DatePicker startDate;
    @javafx.fxml.FXML
    private Label lblStatusValidation;
    @javafx.fxml.FXML
    private Label lblStatusVerify;
    @javafx.fxml.FXML
    private Label lblErrors;
    @javafx.fxml.FXML
    private Label lblStatusProcess;
    @javafx.fxml.FXML
    private Label lblTotalDisputes;
    @javafx.fxml.FXML
    private Label lblPending;
    @javafx.fxml.FXML
    private Label lblResolved;
    @javafx.fxml.FXML
    private Label lblOutput;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleLoadData(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleVerify(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleValidate(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleProcess(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleDisplayOutput(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleAccessModule(ActionEvent actionEvent) {
    }

    public TextField getTxtTransactionId() {
        return txtTransactionId;
    }

    public void setTxtTransactionId(TextField txtTransactionId) {
        this.txtTransactionId = txtTransactionId;
    }

    public ComboBox getCmbDisputeType() {
        return cmbDisputeType;
    }

    public void setCmbDisputeType(ComboBox cmbDisputeType) {
        this.cmbDisputeType = cmbDisputeType;
    }

    public DatePicker getEndDate() {
        return endDate;
    }

    public void setEndDate(DatePicker endDate) {
        this.endDate = endDate;
    }

    public TableView getDisputeTable() {
        return disputeTable;
    }

    public void setDisputeTable(TableView disputeTable) {
        this.disputeTable = disputeTable;
    }

    public DatePicker getStartDate() {
        return startDate;
    }

    public void setStartDate(DatePicker startDate) {
        this.startDate = startDate;
    }

    public Label getLblStatusValidation() {
        return lblStatusValidation;
    }

    public void setLblStatusValidation(Label lblStatusValidation) {
        this.lblStatusValidation = lblStatusValidation;
    }

    public Label getLblStatusVerify() {
        return lblStatusVerify;
    }

    public void setLblStatusVerify(Label lblStatusVerify) {
        this.lblStatusVerify = lblStatusVerify;
    }

    public Label getLblErrors() {
        return lblErrors;
    }

    public void setLblErrors(Label lblErrors) {
        this.lblErrors = lblErrors;
    }

    public Label getLblStatusProcess() {
        return lblStatusProcess;
    }

    public void setLblStatusProcess(Label lblStatusProcess) {
        this.lblStatusProcess = lblStatusProcess;
    }

    public Label getLblTotalDisputes() {
        return lblTotalDisputes;
    }

    public void setLblTotalDisputes(Label lblTotalDisputes) {
        this.lblTotalDisputes = lblTotalDisputes;
    }

    public Label getLblPending() {
        return lblPending;
    }

    public void setLblPending(Label lblPending) {
        this.lblPending = lblPending;
    }

    public Label getLblResolved() {
        return lblResolved;
    }

    public void setLblResolved(Label lblResolved) {
        this.lblResolved = lblResolved;
    }

    public Label getLblOutput() {
        return lblOutput;
    }

    public void setLblOutput(Label lblOutput) {
        this.lblOutput = lblOutput;
    }

    public HandleDisputeResolutionController(TextField txtTransactionId, ComboBox cmbDisputeType, DatePicker endDate, TableView disputeTable, DatePicker startDate, Label lblStatusValidation, Label lblStatusVerify, Label lblErrors, Label lblStatusProcess, Label lblTotalDisputes, Label lblPending, Label lblResolved, Label lblOutput) {
        this.txtTransactionId = txtTransactionId;
        this.cmbDisputeType = cmbDisputeType;
        this.endDate = endDate;
        this.disputeTable = disputeTable;
        this.startDate = startDate;
        this.lblStatusValidation = lblStatusValidation;
        this.lblStatusVerify = lblStatusVerify;
        this.lblErrors = lblErrors;
        this.lblStatusProcess = lblStatusProcess;
        this.lblTotalDisputes = lblTotalDisputes;
        this.lblPending = lblPending;
        this.lblResolved = lblResolved;
        this.lblOutput = lblOutput;
    }
}