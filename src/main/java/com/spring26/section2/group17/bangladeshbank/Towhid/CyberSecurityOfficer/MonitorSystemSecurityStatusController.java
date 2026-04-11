package com.spring26.section2.group17.bangladeshbank.Towhid.CyberSecurityOfficer;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;

public class MonitorSystemSecurityStatusController {

    @FXML
    private ComboBox<String> customRangeBox;

    @FXML
    private RadioButton weekRadio;

    @FXML
    private RadioButton monthRadio;

    @FXML
    private RadioButton todayRadio;

    @FXML
    private TextField threatLevelField;

    @FXML
    private TextField alertsField;

    @FXML
    private TextArea dashboardArea;

    @FXML
    private ComboBox<String> healthComboBox;

    @FXML
    private ToggleGroup timeGroup;

    // =========================
    // 🔐 DUMMY DATA (ARRAYLIST)
    // =========================
    private final List<String> todayThreats = new ArrayList<>();
    private final List<String> weekThreats = new ArrayList<>();
    private final List<String> monthThreats = new ArrayList<>();

    @FXML
    public void initialize() {

        // Toggle group setup
        todayRadio.setToggleGroup(timeGroup);
        weekRadio.setToggleGroup(timeGroup);
        monthRadio.setToggleGroup(timeGroup);

        // ComboBox data
        customRangeBox.getItems().addAll(
                "Last 3 Days",
                "Last 7 Days",
                "Last 15 Days",
                "Last 30 Days"
        );

        healthComboBox.getItems().addAll(
                "Healthy",
                "Moderate Risk",
                "Critical"
        );

        // =========================
        // 🔐 DUMMY SECURITY DATA
        // =========================

        // TODAY DATA
        todayThreats.add("Login attempt failed - IP 192.168.1.10");
        todayThreats.add("Suspicious file access blocked");
        todayThreats.add("Firewall auto-block triggered");

        // WEEK DATA
        weekThreats.add("Multiple failed logins detected");
        weekThreats.add("Unusual admin access request");
        weekThreats.add("Malware scan triggered on server-2");
        weekThreats.add("Port scanning attempt blocked");

        // MONTH DATA
        monthThreats.add("DDoS attempt mitigated");
        monthThreats.add("Phishing email detected in system");
        monthThreats.add("Database access anomaly detected");
        monthThreats.add("External intrusion attempt blocked");
        monthThreats.add("System patch vulnerability scan completed");

        dashboardArea.setEditable(false);
        dashboardArea.setText("Select time range to view security logs...");
    }

    @FXML
    public void ButtonOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/CyberSecurityOfficer/DashboardCSO.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void update(ActionEvent actionEvent) {

        List<String> selectedData = new ArrayList<>();
        String range;
        String threatLevel;
        String alerts;
        String health;

        // =========================
        // RANGE SELECTION LOGIC
        // =========================
        if (todayRadio.isSelected()) {
            selectedData = todayThreats;
            range = "Today";
            threatLevel = "Low";
            alerts = String.valueOf(todayThreats.size());
            health = "Healthy";

        } else if (weekRadio.isSelected()) {
            selectedData = weekThreats;
            range = "Week";
            threatLevel = "Medium";
            alerts = String.valueOf(weekThreats.size());
            health = "Moderate Risk";

        } else if (monthRadio.isSelected()) {
            selectedData = monthThreats;
            range = "Month";
            threatLevel = "High";
            alerts = String.valueOf(monthThreats.size());
            health = "Critical";

        } else if (customRangeBox.getValue() != null) {

            String selected = customRangeBox.getValue();

            switch (selected) {
                case "Last 3 Days" -> {
                    selectedData = todayThreats;
                    threatLevel = "Low";
                    alerts = "3";
                    health = "Healthy";
                }
                case "Last 7 Days" -> {
                    selectedData = weekThreats;
                    threatLevel = "Medium";
                    alerts = "8";
                    health = "Moderate Risk";
                }
                case "Last 15 Days", "Last 30 Days" -> {
                    selectedData = monthThreats;
                    threatLevel = "High";
                    alerts = "15";
                    health = "Critical";
                }
                default -> {
                    selectedData = todayThreats;
                    threatLevel = "Low";
                    alerts = "2";
                    health = "Healthy";
                }
            }

            range = selected;

        } else {
            dashboardArea.setText("⚠ Please select a time range!");
            return;
        }

        // =========================
        // UPDATE UI FIELDS
        // =========================
        threatLevelField.setText(threatLevel);
        alertsField.setText(alerts);
        healthComboBox.setValue(health);

        // =========================
        // DASHBOARD OUTPUT
        // =========================
        StringBuilder sb = new StringBuilder();

        sb.append("🔐 SECURITY DASHBOARD REPORT\n");
        sb.append("-----------------------------\n");
        sb.append("Time Range: ").append(range).append("\n");
        sb.append("Threat Level: ").append(threatLevel).append("\n");
        sb.append("Active Alerts: ").append(alerts).append("\n");
        sb.append("System Health: ").append(health).append("\n\n");

        sb.append("📌 SECURITY LOGS:\n");

        for (String log : selectedData) {
            sb.append("• ").append(log).append("\n");
        }

        dashboardArea.setText(sb.toString());
    }
}