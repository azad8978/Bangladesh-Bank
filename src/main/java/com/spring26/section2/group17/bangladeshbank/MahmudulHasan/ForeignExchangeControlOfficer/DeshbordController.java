package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;

public class DeshbordController {
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void RegulationofForeignCurrencyTransactions(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/ForeignExchangeControlOfficer/RegulationofForeignCurrencyTransactions.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void MonitoringCrossBorderTradePayments(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/ForeignExchangeControlOfficer/MonitoringCross-BorderTradePaymentsController.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void ExchangeRateStabilityControl(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/ForeignExchangeControlOfficer/ExchangeRateStabilityControl.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void AntiMoneyLaunderingAMLEnforcementController(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/ForeignExchangeControlOfficer/Anti-MoneyLaundering(AML)Enforcement.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void SupervisionofAuthorizedDealerADBanks(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/ForeignExchangeControlOfficer/SupervisionofAuthorizedDealer(AD)Banks.fxml");
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
    public void FXPolicyImplementationController(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/ForeignExchangeControlOfficer/FXPolicyImplementation.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void RemittanceFlowRegulation(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/ForeignExchangeControlOfficer/RemittanceFlowRegulation.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void FXDataIntelligenceReporting(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("MahmudulHasan/ForeignExchangeControlOfficer/FXDataIntelligence&Reporting.fxml");
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