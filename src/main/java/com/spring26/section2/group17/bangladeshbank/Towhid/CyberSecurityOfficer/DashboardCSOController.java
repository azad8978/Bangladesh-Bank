package com.spring26.section2.group17.bangladeshbank.Towhid.CyberSecurityOfficer;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;

public class DashboardCSOController
{
    @javafx.fxml.FXML
    public void initialize() {
    }










    @javafx.fxml.FXML
    public void ReviewOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/CyberSecurityOfficer/ReviewSecurityAlerts.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void MonitorOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/CyberSecurityOfficer/MonitorSystemSecurityStatus.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void EnforceOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/CyberSecurityOfficer/EnforceSecurityPolicies.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void ManagerOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/CyberSecurityOfficer/ManageUserAccessViolations.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void InitiateOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/CyberSecurityOfficer/InitiateIncidentResponse.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void LoginOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/Dashboard.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void InvestigateOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/CyberSecurityOfficer/InvestigateSuspiciousActivities.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void GenerateOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/CyberSecurityOfficer/CyberSecurityOfficerGenerateReports.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}