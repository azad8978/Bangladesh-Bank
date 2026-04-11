package com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.SystemUser;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewSimulationDashboardsController {

    @FXML private Button applyButton;

    @FXML private TableView<Simulation> simulationTable;

    @FXML private TableColumn<Simulation, String> nameColumn;
    @FXML private TableColumn<Simulation, Double> valueColumn;

    @FXML private BarChart<String, Number> barChart;
    @FXML private LineChart<String, Number> lineChart;

    @FXML private ComboBox<String> timePeriodCombo;
    @FXML private ComboBox<String> scenarioCombo;

    private ObservableList<Simulation> simulationList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        // ComboBox data
        timePeriodCombo.setItems(FXCollections.observableArrayList(
                "Daily", "Weekly", "Monthly", "Yearly"
        ));

        scenarioCombo.setItems(FXCollections.observableArrayList(
                "Best Case", "Normal Case", "Worst Case"
        ));

        timePeriodCombo.setValue("Monthly");
        scenarioCombo.setValue("Normal Case");

        // Table column binding
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        valueColumn.setCellValueFactory(new PropertyValueFactory<>("value"));

        // Sample data
        simulationList.addAll(
                new Simulation("Revenue", 5000),
                new Simulation("Expense", 3000),
                new Simulation("Profit", 2000)
        );

        simulationTable.setItems(simulationList);

        loadCharts();
    }

    @FXML
    public void applyButtonOnAction(ActionEvent actionEvent) {

        // regenerate data (demo purpose)
        simulationList.clear();

        simulationList.addAll(
                new Simulation("Revenue", Math.random() * 10000),
                new Simulation("Expense", Math.random() * 8000),
                new Simulation("Profit", Math.random() * 5000)
        );

        loadCharts();
    }

    private void loadCharts() {

        // BAR CHART
        XYChart.Series<String, Number> barSeries = new XYChart.Series<>();
        barSeries.setName("Simulation Data");

        for (Simulation s : simulationList) {
            barSeries.getData().add(new XYChart.Data<>(s.getName(), s.getValue()));
        }

        barChart.getData().clear();
        barChart.getData().add(barSeries);

        // LINE CHART
        XYChart.Series<String, Number> lineSeries = new XYChart.Series<>();
        lineSeries.setName("Trend");

        int i = 1;
        for (Simulation s : simulationList) {
            lineSeries.getData().add(new XYChart.Data<>("Point " + i++, s.getValue()));
        }

        lineChart.getData().clear();
        lineChart.getData().add(lineSeries);
    }

    @FXML
    public void BackButton(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("AbuMusaAbid/SystemUser/Deshbord.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // =========================
    // MODEL CLASS
    // =========================
    public static class Simulation {

        private String name;
        private double value;

        public Simulation(String name, double value) {
            this.name = name;
            this.value = value;
        }

        public String getName() { return name; }
        public double getValue() { return value; }
    }
}