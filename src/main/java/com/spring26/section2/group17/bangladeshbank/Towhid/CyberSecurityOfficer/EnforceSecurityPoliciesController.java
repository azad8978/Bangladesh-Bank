package com.spring26.section2.group17.bangladeshbank.Towhid.CyberSecurityOfficer;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class EnforceSecurityPoliciesController {

    @FXML
    private TableView<PolicyData> policyTable;

    @FXML
    private TableColumn<PolicyData, String> PolicyAP;

    @FXML
    private TableColumn<PolicyData, String> StatusAP;

    @FXML
    private TableColumn<PolicyData, String> LastAP;

    @FXML
    private TextArea statusArea;

    // ✅ INITIALIZE WITH ARRAYLIST DUMMY DATA
    @FXML
    public void initialize() {

        // 🔥 FIX COLUMN BINDING (MOST IMPORTANT)
        PolicyAP.setCellValueFactory(new PropertyValueFactory<>("policy"));
        StatusAP.setCellValueFactory(new PropertyValueFactory<>("status"));
        LastAP.setCellValueFactory(new PropertyValueFactory<>("lastUpdated"));

        // ✅ ARRAYLIST DUMMY DATA
        ArrayList<PolicyData> list = new ArrayList<>();

        list.add(new PolicyData("Password Policy", "Active", "2026-04-10"));
        list.add(new PolicyData("Firewall Rule", "Active", "2026-04-09"));
        list.add(new PolicyData("2FA Enforcement", "Inactive", "2026-03-28"));
        list.add(new PolicyData("Access Control", "Active", "2026-04-11"));

        policyTable.setItems(FXCollections.observableArrayList(list));

        statusArea.setText("✔ Security policies loaded successfully.");
    }

    // 🔥 BUTTON ACTION (ENFORCE POLICIES)
    @FXML
    public void enforccepolicy(ActionEvent actionEvent) {

        ArrayList<PolicyData> list = new ArrayList<>();

        list.add(new PolicyData("Password Policy", "Enforced", "2026-04-11"));
        list.add(new PolicyData("Firewall Rule", "Enforced", "2026-04-11"));
        list.add(new PolicyData("2FA Enforcement", "Enforced", "2026-04-11"));
        list.add(new PolicyData("Access Control", "Enforced", "2026-04-11"));

        policyTable.setItems(FXCollections.observableArrayList(list));

        statusArea.setText("✔ All policies have been enforced.");
    }

    // 🔙 BACK BUTTON
    @FXML
    public void ButtonOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/CyberSecurityOfficer/DashboardCSO.fxml");
        }
        catch (Exception e) {
            e.printStackTrace();

        }
    }

    // ✅ MODEL CLASS (REQUIRED FOR TABLE)
    public static class PolicyData {

        private String policy;
        private String status;
        private String lastUpdated;

        public PolicyData(String policy, String status, String lastUpdated) {
            this.policy = policy;
            this.status = status;
            this.lastUpdated = lastUpdated;
        }

        public String getPolicy() {
            return policy;
        }

        public String getStatus() {
            return status;
        }

        public String getLastUpdated() {
            return lastUpdated;
        }
    }
}