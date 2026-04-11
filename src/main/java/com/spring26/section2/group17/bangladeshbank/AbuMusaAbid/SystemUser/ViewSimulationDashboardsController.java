package com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.SystemUser;

import javafx.event.ActionEvent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;

public class ViewSimulationDashboardsController
{
    @javafx.fxml.FXML
    private Button applyButton;
    @javafx.fxml.FXML
    private TableView simulationTable;
    @javafx.fxml.FXML
    private BarChart barChart;
    @javafx.fxml.FXML
    private ComboBox timePeriodCombo;
    @javafx.fxml.FXML
    private ComboBox scenarioCombo;
    @javafx.fxml.FXML
    private LineChart lineChart;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) {
    }
}