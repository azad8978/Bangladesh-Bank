package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class DeshbordController {

    @FXML
    public void initialize() {
    }

    @FXML
    public void RegulationofForeignCurrencyTransactions(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo(
                    "MahmudulHasan/ForeignExchangeControlOfficer/RegulationofForeignCurrencyTransactions.fxml"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void MonitoringCrossBorderTradePayments(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo(
                    "MahmudulHasan/ForeignExchangeControlOfficer/MonitoringCross-BorderTradePayments.fxml"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void ExchangeRateStabilityControl(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo(
                    "MahmudulHasan/ForeignExchangeControlOfficer/ExchangeRateStabilityControl.fxml"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void AntiMoneyLaunderingAMLEnforcement(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo(
                    "MahmudulHasan/ForeignExchangeControlOfficer/Anti-MoneyLaundering(AML)Enforcement.fxml"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void SupervisionofAuthorizedDealerADBanks(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo(
                    "MahmudulHasan/ForeignExchangeControlOfficer/SupervisionofAuthorizedDealer(AD)Banks.fxml"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void FXPolicyImplementation(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo(
                    "MahmudulHasan/ForeignExchangeControlOfficer/FXPolicyImplementation.fxml"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void RemittanceFlowRegulation(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo(
                    "MahmudulHasan/ForeignExchangeControlOfficer/RemittanceFlowRegulation.fxml"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void FXDataIntelligenceReporting(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo(
                    "MahmudulHasan/ForeignExchangeControlOfficer/FXDataIntelligence&Reporting.fxml"
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void BackButton(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/Dashboard.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}