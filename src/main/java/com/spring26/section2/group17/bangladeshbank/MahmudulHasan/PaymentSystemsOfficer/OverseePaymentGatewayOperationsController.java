package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.PaymentSystemsOfficer;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class OverseePaymentGatewayOperationsController
{
    @javafx.fxml.FXML
    private TextField txtTransactionId;
    @javafx.fxml.FXML
    private TableView transactionTable;
    @javafx.fxml.FXML
    private ComboBox cmbStatus;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleValidate(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSearch(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleVerify(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleProcess(ActionEvent actionEvent) {
    }

    @Deprecated
    public void handleLoadData(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        try{
            SceneSwitcher.switchTo("/com/spring26/section2/group17/bangladeshbank/MahmudulHasan/PaymentSystemsOfficer/Deshbord.fxml");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}