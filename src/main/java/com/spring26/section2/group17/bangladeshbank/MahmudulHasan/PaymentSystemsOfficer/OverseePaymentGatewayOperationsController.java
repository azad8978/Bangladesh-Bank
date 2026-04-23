package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.PaymentSystemsOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class OverseePaymentGatewayOperationsController
{
    @javafx.fxml.FXML
    private TextField txtTransactionId;
    @javafx.fxml.FXML
    private TableView complianceTable;
    @javafx.fxml.FXML
    private ComboBox cmbRegulation;
    @javafx.fxml.FXML
    private DatePicker StartDate;
    @javafx.fxml.FXML
    private DatePicker EndDate;
    @javafx.fxml.FXML
    private Label LblStatus;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleValidate(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleSearch(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleVerify(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleProcess(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleLoadData(ActionEvent actionEvent) {
    }

    public TextField getTxtTransactionId() {
        return txtTransactionId;
    }

    public void setTxtTransactionId(TextField txtTransactionId) {
        this.txtTransactionId = txtTransactionId;
    }

    public TableView getComplianceTable() {
        return complianceTable;
    }

    public void setComplianceTable(TableView complianceTable) {
        this.complianceTable = complianceTable;
    }

    public ComboBox getCmbRegulation() {
        return cmbRegulation;
    }

    public void setCmbRegulation(ComboBox cmbRegulation) {
        this.cmbRegulation = cmbRegulation;
    }

    public DatePicker getStartDate() {
        return StartDate;
    }

    public void setStartDate(DatePicker startDate) {
        StartDate = startDate;
    }

    public DatePicker getEndDate() {
        return EndDate;
    }

    public void setEndDate(DatePicker endDate) {
        EndDate = endDate;
    }

    public Label getLblStatus() {
        return LblStatus;
    }

    public void setLblStatus(Label lblStatus) {
        LblStatus = lblStatus;
    }

    public OverseePaymentGatewayOperationsController(TextField txtTransactionId, TableView complianceTable, ComboBox cmbRegulation, DatePicker startDate, DatePicker endDate, Label lblStatus) {
        this.txtTransactionId = txtTransactionId;
        this.complianceTable = complianceTable;
        this.cmbRegulation = cmbRegulation;
        StartDate = startDate;
        EndDate = endDate;
        LblStatus = lblStatus;
    }
}