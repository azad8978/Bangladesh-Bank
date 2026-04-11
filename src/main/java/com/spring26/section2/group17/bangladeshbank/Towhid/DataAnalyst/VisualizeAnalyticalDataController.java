package com.spring26.section2.group17.bangladeshbank.Towhid.DataAnalyst;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class VisualizeAnalyticalDataController {

    @FXML private RadioButton barChartRadio;
    @FXML private RadioButton lineChartRadio;
    @FXML private RadioButton pieChartRadio;
    @FXML private ToggleGroup chartGroup;

    @FXML private ComboBox<String> datasetComboBox;
    @FXML private Pane chartPane;
    @FXML private Button renderButton;


    private ArrayList<String> labels = new ArrayList<>();
    private ArrayList<Integer> values = new ArrayList<>();

    @FXML
    public void initialize() {


        barChartRadio.setToggleGroup(chartGroup);
        lineChartRadio.setToggleGroup(chartGroup);
        pieChartRadio.setToggleGroup(chartGroup);


        datasetComboBox.getItems().addAll("Monthly Data");
        datasetComboBox.getSelectionModel().selectFirst();


        labels.add("Jan");
        labels.add("Feb");
        labels.add("Mar");
        labels.add("Apr");

        values.add(20);
        values.add(50);
        values.add(30);
        values.add(80);


        chartPane.setPrefSize(600, 400);


        renderButton.setOnAction(this::handleRender);
    }


    @FXML
    public void handleRender(ActionEvent event) {

        chartPane.getChildren().clear();

        if (barChartRadio.isSelected()) {
            showBarChart();
        }
        else if (lineChartRadio.isSelected()) {
            showLineChart();
        }
        else if (pieChartRadio.isSelected()) {
            showPieChart();
        }
        else {
            chartPane.getChildren().add(new Label("⚠ Please select a chart type!"));
        }
    }


    private void showBarChart() {

        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("Bar Chart");

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (int i = 0; i < labels.size(); i++) {
            series.getData().add(new XYChart.Data<>(labels.get(i), values.get(i)));
        }

        barChart.getData().add(series);


        barChart.setPrefSize(chartPane.getWidth(), chartPane.getHeight());

        chartPane.getChildren().add(barChart);
    }


    private void showLineChart() {

        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        LineChart<String, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Line Chart");

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (int i = 0; i < labels.size(); i++) {
            series.getData().add(new XYChart.Data<>(labels.get(i), values.get(i)));
        }

        lineChart.getData().add(series);

        lineChart.setPrefSize(chartPane.getWidth(), chartPane.getHeight());

        chartPane.getChildren().add(lineChart);
    }


    private void showPieChart() {

        PieChart pieChart = new PieChart();

        for (int i = 0; i < labels.size(); i++) {
            pieChart.getData().add(new PieChart.Data(labels.get(i), values.get(i)));
        }

        pieChart.setTitle("Pie Chart");

        pieChart.setPrefSize(chartPane.getWidth(), chartPane.getHeight());

        chartPane.getChildren().add(pieChart);
    }


    @FXML
    public void ButtonOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/DataAnalyst/DashboardDA.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}