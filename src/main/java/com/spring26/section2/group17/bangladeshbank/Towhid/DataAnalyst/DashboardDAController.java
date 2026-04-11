package com.spring26.section2.group17.bangladeshbank.Towhid.DataAnalyst;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;

public class DashboardDAController
{
    @javafx.fxml.FXML
    public void initialize() {
    }





    @javafx.fxml.FXML
    public void CleanOA(ActionEvent actionEvent) {

        try {
            SceneSwitcher.switchTo("Towhid/DataAnalyst/CleanandPreprocessData.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void MonitorOA(ActionEvent actionEvent) {

        try {
            SceneSwitcher.switchTo("Towhid/DataAnalyst/MonitorDataQuality.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    @javafx.fxml.FXML
    public void AnalyzeOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/DataAnalyst/AnalyzeTrendsandPatterns.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void VisualizeOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/DataAnalyst/VisualizeAnalyticalData.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void CompareOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/DataAnalyst/CompareAnalyticalScenarios.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void ExportOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/DataAnalyst/ExportAnalyticalOutputs.fxml");
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
    public void AccessOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/DataAnalyst/AccessAnalyticalDatasets.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void GenerateOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/DataAnalyst/GenerateStatisticalSummaries.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}