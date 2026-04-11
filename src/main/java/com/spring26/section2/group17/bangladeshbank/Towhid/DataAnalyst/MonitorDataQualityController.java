package com.spring26.section2.group17.bangladeshbank.Towhid.DataAnalyst;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class MonitorDataQualityController
{
    @javafx.fxml.FXML
    private CheckBox confirmCheckBox;
    @javafx.fxml.FXML
    private
    Button checkButton;
    @javafx.fxml.FXML
    private TableView qualityTable;
    @javafx.fxml.FXML
    private Button confirmButton;
    @javafx.fxml.FXML
    private TextArea detailsArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ButtonOA(ActionEvent actionEvent) {

        try{
            SceneSwitcher.switchTo("Towhid/DataAnalyst/DashboardDA.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}