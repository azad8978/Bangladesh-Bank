package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.PaymentSystemsOfficer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class EnsureRegulatoryComplianceController {

    // ✅ FXML Components
    @FXML private TextField txtTransactionId;
    @FXML private DatePicker startDate;
    @FXML private DatePicker endDate;
    @FXML private ComboBox<String> cmbRegulation;
    @FXML private Label lblStatus;
    @FXML private TableView<?> complianceTable;

    @FXML
    public void initialize() {
        // Optional: initialize ComboBox, TableView, etc.
    }

    // ✅ Button Actions
    @FXML
    private void handleLoadData(ActionEvent event) {
        lblStatus.setText("Data Loaded...");
    }

    @FXML
    private void handleValidate(ActionEvent event) {
        lblStatus.setText("Validation Successful");
    }

    @FXML
    private void handleVerify(ActionEvent event) {
        lblStatus.setText("Transaction Verified");
    }

    @FXML
    private void handleProcess(ActionEvent event) {
        lblStatus.setText("Processing Completed");
    }


    public TextField getTxtTransactionId() {
        return txtTransactionId;
    }

    public void setTxtTransactionId(TextField txtTransactionId) {
        this.txtTransactionId = txtTransactionId;
    }

    public DatePicker getStartDate() {
        return startDate;
    }

    public void setStartDate(DatePicker startDate) {
        this.startDate = startDate;
    }

    public DatePicker getEndDate() {
        return endDate;
    }

    public void setEndDate(DatePicker endDate) {
        this.endDate = endDate;
    }

    public ComboBox<String> getCmbRegulation() {
        return cmbRegulation;
    }

    public void setCmbRegulation(ComboBox<String> cmbRegulation) {
        this.cmbRegulation = cmbRegulation;
    }

    public Label getLblStatus() {
        return lblStatus;
    }

    public void setLblStatus(Label lblStatus) {
        this.lblStatus = lblStatus;
    }

    public TableView<?> getComplianceTable() {
        return complianceTable;
    }

    public void setComplianceTable(TableView<?> complianceTable) {
        this.complianceTable = complianceTable;
    }


    public EnsureRegulatoryComplianceController(TextField txtTransactionId, DatePicker startDate, DatePicker endDate, ComboBox<String> cmbRegulation, Label lblStatus, TableView<?> complianceTable) {
        this.txtTransactionId = txtTransactionId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cmbRegulation = cmbRegulation;
        this.lblStatus = lblStatus;
        this.complianceTable = complianceTable;
    }
}