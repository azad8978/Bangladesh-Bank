package com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.FinanceManager;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class TrackFundInflowsController
{
    @javafx.fxml.FXML
    private TableColumn transactionIdColumn;
    @javafx.fxml.FXML
    private TextField toDateField;
    @javafx.fxml.FXML
    private ComboBox sourceComboBox;
    @javafx.fxml.FXML
    private TextField fromDateField;
    @javafx.fxml.FXML
    private TableView fundTable;
    @javafx.fxml.FXML
    private TableColumn amountColumn;
    @javafx.fxml.FXML
    private TableColumn dateColumn;
    @javafx.fxml.FXML
    private Button filterButton;
    @javafx.fxml.FXML
    private TableColumn sourceColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("AbuMusaAbid/FinanceManager/Deshbord.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}