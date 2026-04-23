package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.PaymentSystemsOfficer;

import javafx.scene.control.*;

public class MonitorFraudRiskController
{
    @javafx.fxml.FXML
    private TableView reportTable;
    @javafx.fxml.FXML
    private ProgressIndicator progressIndicator;
    @javafx.fxml.FXML
    private Button processBtn;
    @javafx.fxml.FXML
    private ComboBox moduleComboBox;
    @javafx.fxml.FXML
    private Button validateBtn;
    @javafx.fxml.FXML
    private Button verifyBtn;
    @javafx.fxml.FXML
    private TextField transactionField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    public TableView getReportTable() {
        return reportTable;
    }

    public void setReportTable(TableView reportTable) {
        this.reportTable = reportTable;
    }

    public ProgressIndicator getProgressIndicator() {
        return progressIndicator;
    }

    public void setProgressIndicator(ProgressIndicator progressIndicator) {
        this.progressIndicator = progressIndicator;
    }

    public Button getProcessBtn() {
        return processBtn;
    }

    public void setProcessBtn(Button processBtn) {
        this.processBtn = processBtn;
    }

    public ComboBox getModuleComboBox() {
        return moduleComboBox;
    }

    public void setModuleComboBox(ComboBox moduleComboBox) {
        this.moduleComboBox = moduleComboBox;
    }

    public Button getValidateBtn() {
        return validateBtn;
    }

    public void setValidateBtn(Button validateBtn) {
        this.validateBtn = validateBtn;
    }

    public Button getVerifyBtn() {
        return verifyBtn;
    }

    public void setVerifyBtn(Button verifyBtn) {
        this.verifyBtn = verifyBtn;
    }

    public TextField getTransactionField() {
        return transactionField;
    }

    public void setTransactionField(TextField transactionField) {
        this.transactionField = transactionField;
    }

    public Label getStatusLabel() {
        return statusLabel;
    }

    public void setStatusLabel(Label statusLabel) {
        this.statusLabel = statusLabel;
    }


    public MonitorFraudRiskController(TableView reportTable, ProgressIndicator progressIndicator, Button processBtn, ComboBox moduleComboBox, Button validateBtn, Button verifyBtn, TextField transactionField, Label statusLabel) {
        this.reportTable = reportTable;
        this.progressIndicator = progressIndicator;
        this.processBtn = processBtn;
        this.moduleComboBox = moduleComboBox;
        this.validateBtn = validateBtn;
        this.verifyBtn = verifyBtn;
        this.transactionField = transactionField;
        this.statusLabel = statusLabel;
    }
}