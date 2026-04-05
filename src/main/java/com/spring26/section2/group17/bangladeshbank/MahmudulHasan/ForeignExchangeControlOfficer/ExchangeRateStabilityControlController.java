package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ExchangeRateStabilityControlController
{

    @javafx.fxml.FXML
    private Button btnSubmitFX;
    @javafx.fxml.FXML
    private Button btnAnalyze;
    @javafx.fxml.FXML
    private TextField buyRateField;
    @javafx.fxml.FXML
    private Label volatilityLabel;
    @javafx.fxml.FXML
    private TableColumn colVolatility;
    @javafx.fxml.FXML
    private Button btnOpenModule;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private Label deviationLabel;
    @javafx.fxml.FXML
    private TextField bankField;
    @javafx.fxml.FXML
    private ComboBox currencyBox;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private ProgressBar stabilityBar;
    @javafx.fxml.FXML
    private TableView historyTable;
    @javafx.fxml.FXML
    private TextField sellRateField;
    @javafx.fxml.FXML
    private TableColumn colBank;
    @javafx.fxml.FXML
    private TableColumn colBuy;
    @javafx.fxml.FXML
    private Label statusBar;
    @javafx.fxml.FXML
    private TableColumn colSell;
    @javafx.fxml.FXML
    private TableColumn colCurrency;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void handleSave(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleValidate(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleReject(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleApprove(ActionEvent actionEvent) {
    }
}