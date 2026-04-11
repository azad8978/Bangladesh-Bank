package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ExchangeRateStabilityControlController {



    @FXML private TextField bankField;
    @FXML private ComboBox<String> currencyBox;
    @FXML private TextField buyRateField;
    @FXML private TextField sellRateField;
    @FXML private DatePicker datePicker;

    @FXML private Label volatilityLabel;
    @FXML private Label deviationLabel;
    @FXML private ProgressBar stabilityBar;

    @FXML private TableView<FXRecord> historyTable;

    @FXML private TableColumn<FXRecord, String> colBank;
    @FXML private TableColumn<FXRecord, String> colCurrency;
    @FXML private TableColumn<FXRecord, Double> colBuy;
    @FXML private TableColumn<FXRecord, Double> colSell;
    @FXML private TableColumn<FXRecord, Double> colVolatility;

    @FXML private Button btnOpenModule;
    @FXML private Button btnSubmitFX;
    @FXML private Button btnAnalyze;



    private ObservableList<FXRecord> records = FXCollections.observableArrayList();

    private double lastVolatility = 0;
    private double lastDeviation = 0;



    @FXML
    public void initialize() {

        currencyBox.getItems().addAll("USD", "EUR", "GBP", "JPY", "BDT");

        colBank.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getBank()));
        colCurrency.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getCurrency()));
        colBuy.setCellValueFactory(data -> new SimpleDoubleProperty(data.getValue().getBuy()).asObject());
        colSell.setCellValueFactory(data -> new SimpleDoubleProperty(data.getValue().getSell()).asObject());
        colVolatility.setCellValueFactory(data -> new SimpleDoubleProperty(data.getValue().getVolatility()).asObject());

        historyTable.setItems(records);

        stabilityBar.setProgress(0);
    }


    @FXML
    private void handleOpenModule() {
        showAlert("Module Opened", "FX Control Panel Activated");
    }



    @FXML
    private void handleSubmitFX() {

        if (!isValidInput()) return;

        showAlert("Submitted", "FX Data Captured Successfully");
    }



    @FXML
    private void handleAnalyze() {

        if (!isValidInput()) return;

        double buy = Double.parseDouble(buyRateField.getText());
        double sell = Double.parseDouble(sellRateField.getText());


        lastVolatility = Math.abs(sell - buy);
        lastDeviation = lastVolatility / buy;

        volatilityLabel.setText(String.format("%.2f", lastVolatility));
        deviationLabel.setText(String.format("%.4f", lastDeviation));

        updateStabilityBar();


        records.add(new FXRecord(
                bankField.getText(),
                currencyBox.getValue(),
                buy,
                sell,
                lastVolatility
        ));

        clearFields();
    }


    private void updateStabilityBar() {

        if (lastDeviation < 0.02) {
            stabilityBar.setProgress(0.9); // Stable
        } else if (lastDeviation < 0.05) {
            stabilityBar.setProgress(0.6); // Moderate
        } else {
            stabilityBar.setProgress(0.3); // Risky
        }
    }



    private boolean isValidInput() {

        if (bankField.getText().isEmpty() ||
                currencyBox.getValue() == null ||
                buyRateField.getText().isEmpty() ||
                sellRateField.getText().isEmpty() ||
                datePicker.getValue() == null) {

            showAlert("Missing Data", "Fill all fields properly");
            return false;
        }

        try {
            double buy = Double.parseDouble(buyRateField.getText());
            double sell = Double.parseDouble(sellRateField.getText());

            if (buy <= 0 || sell <= 0) {
                showAlert("Invalid Rate", "Rates must be positive");
                return false;
            }

        } catch (Exception e) {
            showAlert("Error", "Rates must be numeric");
            return false;
        }

        return true;
    }



    private void clearFields() {
        bankField.clear();
        currencyBox.setValue(null);
        buyRateField.clear();
        sellRateField.clear();
        datePicker.setValue(null);
    }

    private void showAlert(String title, String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(msg);
        alert.show();
    }
}