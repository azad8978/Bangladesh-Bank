package com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.FinanceManager;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.*;
import javafx.scene.control.*;

public class MonitorFinancialSummaryController {

    @FXML
    private Label totalRevenueLabel;

    @FXML
    private Label netResultLabel;

    @FXML
    private ComboBox<String> timePeriodCombo;

    @FXML
    private BarChart<String, Number> revenueChart;

    @FXML
    private PieChart expenditureChart;

    @FXML
    private Button updateButton;

    @FXML
    private Label totalExpenditureLabel;

    @FXML
    public void initialize() {

        // ComboBox values
        timePeriodCombo.setItems(FXCollections.observableArrayList(
                "Monthly", "Quarterly", "Yearly"
        ));
        timePeriodCombo.setValue("Monthly");

        // Load initial data
        loadData("Monthly");

        // Button action
        updateButton.setOnAction(e -> {
            String period = timePeriodCombo.getValue();
            loadData(period);
        });
    }

    private void loadData(String period) {

        // Clear charts
        revenueChart.getData().clear();
        expenditureChart.getData().clear();

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        double totalRevenue = 0;
        double totalExpense = 0;

        // Sample data based on period
        if (period.equals("Monthly")) {

            series.getData().add(new XYChart.Data<>("Week1", 20000));
            series.getData().add(new XYChart.Data<>("Week2", 30000));
            series.getData().add(new XYChart.Data<>("Week3", 25000));
            series.getData().add(new XYChart.Data<>("Week4", 40000));

            totalRevenue = 115000;
            totalExpense = 70000;

        } else if (period.equals("Quarterly")) {

            series.getData().add(new XYChart.Data<>("Q1", 150000));
            series.getData().add(new XYChart.Data<>("Q2", 180000));
            series.getData().add(new XYChart.Data<>("Q3", 200000));
            series.getData().add(new XYChart.Data<>("Q4", 170000));

            totalRevenue = 700000;
            totalExpense = 450000;

        } else {

            series.getData().add(new XYChart.Data<>("2023", 800000));
            series.getData().add(new XYChart.Data<>("2024", 900000));
            series.getData().add(new XYChart.Data<>("2025", 1000000));

            totalRevenue = 2700000;
            totalExpense = 1800000;
        }

        // Add data to bar chart
        revenueChart.getData().add(series);

        // Pie chart data
        expenditureChart.setData(FXCollections.observableArrayList(
                new PieChart.Data("Operational", totalExpense * 0.5),
                new PieChart.Data("Salary", totalExpense * 0.3),
                new PieChart.Data("Maintenance", totalExpense * 0.2)
        ));

        // Update labels
        totalRevenueLabel.setText("Total Revenue: " + totalRevenue);
        totalExpenditureLabel.setText("Total Expenditure: " + totalExpense);

        double net = totalRevenue - totalExpense;
        netResultLabel.setText("Net Result: " + net);
    }

    @FXML
    public void BackButton(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("AbuMusaAbid/FinanceManager/Deshbord.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}