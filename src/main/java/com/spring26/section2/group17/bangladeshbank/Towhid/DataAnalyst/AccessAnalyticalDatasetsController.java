package com.spring26.section2.group17.bangladeshbank.Towhid.DataAnalyst;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class AccessAnalyticalDatasetsController
{
    @javafx.fxml.FXML
    private TableColumn timeColumn;
    @javafx.fxml.FXML
    private Button previewButton;
    @javafx.fxml.FXML
    private TableColumn nameColumn;
    @javafx.fxml.FXML
    private ComboBox<String> typeComboBox;
    @javafx.fxml.FXML
    private TextArea previewArea;
    @javafx.fxml.FXML
    private TextField timeField;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private TableView datasetTable;
    @javafx.fxml.FXML
    private TableColumn typeColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void ButtonOA(ActionEvent actionEvent)
    {

        try{
            SceneSwitcher.switchTo("Towhid/DataAnalyst/DashboardDA.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}