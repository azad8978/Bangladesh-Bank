package com.spring26.section2.group17.bangladeshbank.Towhid.CyberSecurityOfficer;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CyberSecurityOfficerGenerateReportsController {

    @FXML
    private TableView<ReportData> reportTable;

    @FXML
    private TableColumn<ReportData, String> ParameterDA;

    @FXML
    private TableColumn<ReportData, String> VauleDA;

    @FXML
    private TableColumn<ReportData, String> StarusDA;

    @FXML
    private DatePicker endDate;

    @FXML
    private ComboBox<String> reportTypeComboBox;

    @FXML
    private DatePicker startDate;

    @FXML
    private TextArea summaryArea;

    private ObservableList<ReportData> reportList;

    @FXML
    public void initialize() {

        // 🔥 FIX: ensure clean list
        reportList = FXCollections.observableArrayList();

        // 🔥 MUST match getters EXACTLY
        ParameterDA.setCellValueFactory(new PropertyValueFactory<>("parameter"));
        VauleDA.setCellValueFactory(new PropertyValueFactory<>("value"));
        StarusDA.setCellValueFactory(new PropertyValueFactory<>("status"));

        // 🔥 Dummy data
        reportList.addAll(
                new ReportData("Login Attempts", "150", "Normal"),
                new ReportData("Failed Logins", "23", "Warning"),
                new ReportData("Firewall Alerts", "12", "Normal")
        );

        reportTable.setItems(reportList);

        reportTypeComboBox.setItems(FXCollections.observableArrayList(
                "Daily Report",
                "Weekly Report",
                "Monthly Report"
        ));
    }

    @FXML
    public void generateReport(ActionEvent actionEvent) {

        String type = reportTypeComboBox.getValue();

        if (type == null) {
            summaryArea.setText("⚠ Please select a report type!");
            return;
        }

        reportList.clear();

        if (type.equals("Daily Report")) {
            reportList.add(new ReportData("Login Attempts", "50", "Normal"));
            reportList.add(new ReportData("Failed Logins", "5", "Warning"));
        }
        else if (type.equals("Weekly Report")) {
            reportList.add(new ReportData("Malware Detected", "10", "Critical"));
            reportList.add(new ReportData("Firewall Alerts", "20", "Normal"));
        }
        else if (type.equals("Monthly Report")) {
            reportList.add(new ReportData("Unauthorized Access", "8", "Critical"));
            reportList.add(new ReportData("System Errors", "15", "Warning"));
        }

        reportTable.refresh();

        summaryArea.setText(
                "Report Type: " + type +
                        "\nRecords: " + reportList.size() +
                        "\nStart Date: " + startDate.getValue() +
                        "\nEnd Date: " + endDate.getValue()
        );
    }

    @FXML
    public void ButtonOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/CyberSecurityOfficer/DashboardCSO.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class ReportData {

        private String parameter;
        private String value;
        private String status;

        public ReportData(String parameter, String value, String status) {
            this.parameter = parameter;
            this.value = value;
            this.status = status;
        }

        public String getParameter() { return parameter; }
        public String getValue() { return value; }
        public String getStatus() { return status; }
    }
}