package com.spring26.section2.group17.bangladeshbank.Towhid;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;

public class DashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void button1_oa(ActionEvent actionEvent) {
        try{
            SceneSwitcher.switchTo("Towhid/CyberSecurityOfficer/DashboardCSO.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void button2_oa(ActionEvent actionEvent) {
        try{
            SceneSwitcher.switchTo("Towhid/DataAnalyst/DashboardDA.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void button4_oa(ActionEvent actionEvent) {
        try{
            SceneSwitcher.switchTo("AbuMusaAbid/FinanceManager/Deshbord.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void button3_oa(ActionEvent actionEvent) {
        try{
            SceneSwitcher.switchTo("AbuMusaAbid/SystemUser/Deshbord.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    @javafx.fxml.FXML
    public void button5_oa(ActionEvent actionEvent) {
        try{
            SceneSwitcher.switchTo("MahmudulHasan/ForeignExchangeControlOfficer/Deshbord.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void button6_oa(ActionEvent actionEvent) {
        try{
            SceneSwitcher.switchTo("MahmudulHasan/PaymentSystemsOfficer/Deshbord.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}