package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.PaymentSystemsOfficer;

import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class ManageBankPSPIntegrationController
{
    @javafx.fxml.FXML
    private TextField searchField;
    @javafx.fxml.FXML
    private Button processBtn;
    @javafx.fxml.FXML
    private Pane chartsPane;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private Button verifyBtn;
    @javafx.fxml.FXML
    private TextField bankField;
    @javafx.fxml.FXML
    private TextField transactionField;
    @javafx.fxml.FXML
    private TextField amountField;
    @javafx.fxml.FXML
    private ListView alertsList;
    @javafx.fxml.FXML
    private Label verifyStatus;
    @javafx.fxml.FXML
    private TableView outputTable;
    @javafx.fxml.FXML
    private VBox sidebar;
    @javafx.fxml.FXML
    private ComboBox moduleComboBox;
    @javafx.fxml.FXML
    private ProgressBar processProgress;
    @javafx.fxml.FXML
    private TextField pspField;
    @javafx.fxml.FXML
    private Button validateBtn;
    @javafx.fxml.FXML
    private Label validationStatus;

    @javafx.fxml.FXML
    public void initialize() {
    }

    public TextField getSearchField() {
        return searchField;
    }

    public void setSearchField(TextField searchField) {
        this.searchField = searchField;
    }

    public Button getProcessBtn() {
        return processBtn;
    }

    public void setProcessBtn(Button processBtn) {
        this.processBtn = processBtn;
    }

    public Pane getChartsPane() {
        return chartsPane;
    }

    public void setChartsPane(Pane chartsPane) {
        this.chartsPane = chartsPane;
    }

    public DatePicker getDatePicker() {
        return datePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        this.datePicker = datePicker;
    }

    public Button getVerifyBtn() {
        return verifyBtn;
    }

    public void setVerifyBtn(Button verifyBtn) {
        this.verifyBtn = verifyBtn;
    }

    public TextField getBankField() {
        return bankField;
    }

    public void setBankField(TextField bankField) {
        this.bankField = bankField;
    }

    public TextField getTransactionField() {
        return transactionField;
    }

    public void setTransactionField(TextField transactionField) {
        this.transactionField = transactionField;
    }

    public TextField getAmountField() {
        return amountField;
    }

    public void setAmountField(TextField amountField) {
        this.amountField = amountField;
    }

    public ListView getAlertsList() {
        return alertsList;
    }

    public void setAlertsList(ListView alertsList) {
        this.alertsList = alertsList;
    }

    public Label getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Label verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public TableView getOutputTable() {
        return outputTable;
    }

    public void setOutputTable(TableView outputTable) {
        this.outputTable = outputTable;
    }

    public VBox getSidebar() {
        return sidebar;
    }

    public void setSidebar(VBox sidebar) {
        this.sidebar = sidebar;
    }

    public ComboBox getModuleComboBox() {
        return moduleComboBox;
    }

    public void setModuleComboBox(ComboBox moduleComboBox) {
        this.moduleComboBox = moduleComboBox;
    }

    public ProgressBar getProcessProgress() {
        return processProgress;
    }

    public void setProcessProgress(ProgressBar processProgress) {
        this.processProgress = processProgress;
    }

    public TextField getPspField() {
        return pspField;
    }

    public void setPspField(TextField pspField) {
        this.pspField = pspField;
    }

    public Button getValidateBtn() {
        return validateBtn;
    }

    public void setValidateBtn(Button validateBtn) {
        this.validateBtn = validateBtn;
    }

    public Label getValidationStatus() {
        return validationStatus;
    }

    public void setValidationStatus(Label validationStatus) {
        this.validationStatus = validationStatus;
    }

    public ManageBankPSPIntegrationController(TextField searchField, Button processBtn, Pane chartsPane, DatePicker datePicker, Button verifyBtn, TextField bankField, TextField transactionField, TextField amountField, ListView alertsList, Label verifyStatus, TableView outputTable, VBox sidebar, ComboBox moduleComboBox, ProgressBar processProgress, TextField pspField, Button validateBtn, Label validationStatus) {
        this.searchField = searchField;
        this.processBtn = processBtn;
        this.chartsPane = chartsPane;
        this.datePicker = datePicker;
        this.verifyBtn = verifyBtn;
        this.bankField = bankField;
        this.transactionField = transactionField;
        this.amountField = amountField;
        this.alertsList = alertsList;
        this.verifyStatus = verifyStatus;
        this.outputTable = outputTable;
        this.sidebar = sidebar;
        this.moduleComboBox = moduleComboBox;
        this.processProgress = processProgress;
        this.pspField = pspField;
        this.validateBtn = validateBtn;
        this.validationStatus = validationStatus;
    }


}