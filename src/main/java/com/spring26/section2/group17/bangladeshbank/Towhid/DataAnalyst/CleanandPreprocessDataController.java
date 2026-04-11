package com.spring26.section2.group17.bangladeshbank.Towhid.DataAnalyst;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class CleanandPreprocessDataController
{
    @javafx.fxml.FXML
    private TableColumn timeColumn;
    @javafx.fxml.FXML
    private Button applyButton;
    @javafx.fxml.FXML
    private TableColumn nameColumn;
    @javafx.fxml.FXML
    private TextArea notesArea;
    @javafx.fxml.FXML
    private CheckBox removeNullCheckBox;
    @javafx.fxml.FXML
    private ComboBox methodComboBox;
    @javafx.fxml.FXML
    private CheckBox normalizeCheckBox;
    @javafx.fxml.FXML
    private TableView datasetTable;
    @javafx.fxml.FXML
    private TableColumn typeColumn;
    @javafx.fxml.FXML
    private Button preprocessButton;
    @javafx.fxml.FXML
    private TextField outputField;

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