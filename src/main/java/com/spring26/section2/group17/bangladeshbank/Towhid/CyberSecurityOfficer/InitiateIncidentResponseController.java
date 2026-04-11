package com.spring26.section2.group17.bangladeshbank.Towhid.CyberSecurityOfficer;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.util.ArrayList;

public class InitiateIncidentResponseController {

    @FXML
    private TextArea statusArea;

    @FXML
    private TextArea descriptionArea;

    @FXML
    private ComboBox<String> incidentTypeComboBox;

    @FXML
    private ComboBox<String> severityComboBox;

    // ArrayList to store incidents
    private ArrayList<String> incidentList;

    @FXML
    public void initialize() {

        // Initialize ArrayList
        incidentList = new ArrayList<>();

        // Event 2: System displays form data (dummy values)
        incidentTypeComboBox.getItems().addAll(
                "Unauthorized Access",
                "Phishing Attack",
                "Malware Infection",
                "Data Breach"
        );

        severityComboBox.getItems().addAll(
                "Low",
                "Medium",
                "High",
                "Critical"
        );
    }

    @FXML
    public void ButtonOA(ActionEvent actionEvent) {
        try {
            // Event 1: Navigate to Incident Response page
            SceneSwitcher.switchTo("Towhid/CyberSecurityOfficer/DashboardCSO.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initiateresponse(ActionEvent actionEvent) {

        // Event 3: Officer enters details
        String type = incidentTypeComboBox.getValue();
        String severity = severityComboBox.getValue();
        String description = descriptionArea.getText();

        if (type == null || severity == null || description.isEmpty()) {
            statusArea.setText("⚠ Please fill all fields!");
            return;
        }

        // Event 5: System records incident
        String incidentRecord = "Incident Type: " + type +
                "\nSeverity: " + severity +
                "\nDescription: " + description +
                "\nStatus: Response Initiated";

        incidentList.add(incidentRecord);

        // Simulate notification
        String notification = "\n\n📢 Stakeholders Notified Successfully!";

        // Show output
        statusArea.setText("✅ Incident Recorded!\n\n" + incidentRecord + notification);

        // Clear fields
        incidentTypeComboBox.setValue(null);
        severityComboBox.setValue(null);
        descriptionArea.clear();
    }
}