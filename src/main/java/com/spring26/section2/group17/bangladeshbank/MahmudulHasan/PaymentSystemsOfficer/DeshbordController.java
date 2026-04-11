package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.PaymentSystemsOfficer;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;

public class DeshbordController {
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ManageElectronicFundTransfers(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/PaymentSystemsOfficer/RegulationofForeignCurrencyTransactions.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void MonitorTransactionSettlement(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/PaymentSystemsOfficer/MonitoringCross-BorderTradePaymentsController.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void OverseePaymentGatewayOperations(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/PaymentSystemsOfficer/ExchangeRateStabilityControl.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void EnsureRegulatoryCompliance(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/PaymentSystemsOfficer/Anti-MoneyLaundering(AML)Enforcement.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void HandleDisputeResolution(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/PaymentSystemsOfficer/SupervisionofAuthorizedDealer(AD)Banks.fxml");
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

    @Deprecated
    public void MonitorFraudRisk(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/PaymentSystemsOfficer/FXPolicyImplementation.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void ManageBankPSPIntegration(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/PaymentSystemsOfficer/RemittanceFlowRegulation.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void GeneratePaymentPerformanceReports(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/PaymentSystemsOfficer/FXDataIntelligence&Reporting.fxml");
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