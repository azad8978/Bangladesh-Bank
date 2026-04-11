package com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.FinanceManager;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ApproveBudgetAllocationsController
{
    @javafx.fxml.FXML
    private TableColumn amountColumn;
    @javafx.fxml.FXML
    private TableColumn departmentColumn;
    @javafx.fxml.FXML
    private TableColumn requestedByColumn;
    @javafx.fxml.FXML
    private TableColumn purposeColumn;
    @javafx.fxml.FXML
    private Button approveButton;
    @javafx.fxml.FXML
    private Button rejectButton;
    @javafx.fxml.FXML
    private TextField commentField;
    @javafx.fxml.FXML
    private TextArea detailsArea;
    @javafx.fxml.FXML
    private TableView budgetTable;

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