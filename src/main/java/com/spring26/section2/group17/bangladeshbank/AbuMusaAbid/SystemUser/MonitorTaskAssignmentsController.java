package com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.SystemUser;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class MonitorTaskAssignmentsController
{
    @javafx.fxml.FXML
    private TableColumn taskIdColumn;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TextArea taskDetailsArea;
    @javafx.fxml.FXML
    private TableView taskTable;
    @javafx.fxml.FXML
    private TableColumn descriptionColumn;
    @javafx.fxml.FXML
    private TableColumn deadlineColumn;
    @javafx.fxml.FXML
    private Button BackButton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButton_oas(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("AbuMusaAbid/SystemUser/Deshbord.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
