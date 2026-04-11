package com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.FinanceManager;

import javafx.event.ActionEvent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class MonitorFinancialSummaryController
{
    @javafx.fxml.FXML
    private Label totalRevenueLabel;
    @javafx.fxml.FXML
    private Label netResultLabel;
    @javafx.fxml.FXML
    private ComboBox timePeriodCombo;
    @javafx.fxml.FXML
    private BarChart revenueChart;
    @javafx.fxml.FXML
    private PieChart expenditureChart;
    @javafx.fxml.FXML
    private Button updateButton;
    @javafx.fxml.FXML
    private Label totalExpenditureLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) {
    }
}