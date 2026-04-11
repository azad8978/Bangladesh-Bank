package com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.FinanceManager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class TrackRevenueSourcesController
{
    @javafx.fxml.FXML
    private TextField toDateField;
    @javafx.fxml.FXML
    private ComboBox sourceComboBox;
    @javafx.fxml.FXML
    private TableView revenueTable;
    @javafx.fxml.FXML
    private Label totalRevenueLabel;
    @javafx.fxml.FXML
    private TextField fromDateField;
    @javafx.fxml.FXML
    private TableColumn amountColumn;
    @javafx.fxml.FXML
    private TableColumn sourceNameColumn;
    @javafx.fxml.FXML
    private TableColumn dateColumn;
    @javafx.fxml.FXML
    private Button filterButton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) {
    }
}