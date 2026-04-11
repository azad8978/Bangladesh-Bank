package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class FXDataIntelligenceReportingController {

    // UI
    @FXML private Button btnLaunch;
    @FXML private Button btnRun;

    @FXML private ComboBox<String> datasetBox;

    @FXML private DatePicker startDate;
    @FXML private DatePicker endDate;

    @FXML private Label avgRateLabel;
    @FXML private Label riskLabel;
    @FXML private Label trendLabel;

    @FXML private TextArea reportArea;

    @FXML private TableView<FXArchiveRecord> archiveTable;

    @FXML private TableColumn<FXArchiveRecord, String> colDataset;
    @FXML private TableColumn<FXArchiveRecord, String> colPeriod;
    @FXML private TableColumn<FXArchiveRecord, Double> colAvg;
    @FXML private TableColumn<FXArchiveRecord, String> colRisk;

    private ObservableList<FXArchiveRecord> archiveData = FXCollections.observableArrayList();

    private final Random random = new Random();

    @FXML
    public void initialize() {

        datasetBox.setItems(FXCollections.observableArrayList(
                "Daily FX Rates",
                "Bank Wise Data",
                "Market Trends",
                "Cross Border Flow"
        ));

        colDataset.setCellValueFactory(new PropertyValueFactory<>("dataset"));
        colPeriod.setCellValueFactory(new PropertyValueFactory<>("period"));
        colAvg.setCellValueFactory(new PropertyValueFactory<>("avgRate"));
        colRisk.setCellValueFactory(new PropertyValueFactory<>("risk"));

        archiveTable.setItems(archiveData);

        avgRateLabel.setText("--");
        riskLabel.setText("--");
        trendLabel.setText("--");

        btnLaunch.setOnAction(e -> launchDashboard());
        btnRun.setOnAction(e -> runAnalysis());
    }

    // EVENT 1
    private void launchDashboard() {
        reportArea.setText("FX Intelligence Dashboard Activated...\nSystems Online ✔");
    }

    // EVENT 2 + 3 + 4 + 5 (Core Brain)
    private void runAnalysis() {

        if (datasetBox.getValue() == null || startDate.getValue() == null || endDate.getValue() == null) {
            reportArea.setText("Missing analysis parameters ❌");
            return;
        }

        long days = ChronoUnit.DAYS.between(startDate.getValue(), endDate.getValue());

        if (days <= 0) {
            reportArea.setText("Invalid date range ❌");
            return;
        }

        // SIMULATED FX INTELLIGENCE
        double avgRate = 100 + random.nextDouble() * 20;

        String risk;
        if (avgRate > 115) {
            risk = "High Risk ⚠";
        } else if (avgRate > 108) {
            risk = "Medium Risk";
        } else {
            risk = "Stable ✔";
        }

        String trend;
        if (random.nextBoolean()) {
            trend = "Rising 📈";
        } else {
            trend = "Falling 📉";
        }

        // UI UPDATE
        avgRateLabel.setText(String.format("%.2f", avgRate));
        riskLabel.setText(risk);
        trendLabel.setText(trend);

        // REPORT GENERATION
        String report = """
                FX INTELLIGENCE REPORT
                ----------------------
                Dataset: %s
                Period: %s to %s
                Days Analyzed: %d

                Average Rate: %.2f
                Risk Level: %s
                Market Trend: %s

                System Verdict: %s
                """.formatted(
                datasetBox.getValue(),
                startDate.getValue(),
                endDate.getValue(),
                days,
                avgRate,
                risk,
                trend,
                risk.contains("High") ? "INTERVENTION REQUIRED" : "NORMAL OPERATIONS"
        );

        reportArea.setText(report);

        // ARCHIVE LOG
        archiveData.add(new FXArchiveRecord(
                datasetBox.getValue(),
                startDate.getValue() + " → " + endDate.getValue(),
                avgRate,
                risk
        ));
    }
}