package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.PaymentSystemsOfficer;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class DeshbordController {
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ManageElectronicFundTransfers(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/PaymentSystemsOfficer/ManageElectronicFundTransfers.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void MonitorTransactionSettlement(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/PaymentSystemsOfficer/MonitorTransactionSettlement.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void OverseePaymentGatewayOperations(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("/com/spring26/section2/group17/bangladeshbank/MahmudulHasan/PaymentSystemsOfficer/OverseePaymentGatewayOperations.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void EnsureRegulatoryCompliance(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/PaymentSystemsOfficer/EnsureRegulatoryCompliance.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void HandleDisputeResolution(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/PaymentSystemsOfficer/HandleDisputeResolution.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void Button(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/Dashboard.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void MonitorFraudRisk(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("/com/spring26/section2/group17/bangladeshbank/MahmudulHasan/PaymentSystemsOfficer/MonitorFraud&Risk.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void ManageBankPSPIntegration(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/PaymentSystemsOfficer/ManageBank&PSPIntegration.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void GeneratePaymentPerformanceReports(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/PaymentSystemsOfficer/GeneratePaymentPerformanceReports.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/Dashboard.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}