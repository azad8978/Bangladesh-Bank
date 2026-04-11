package com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.SystemUser;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SubmitOperationalRequestsController
{
    @javafx.fxml.FXML
    private RadioButton mediumPriority;
    @javafx.fxml.FXML
    private TableColumn priorityColumn;
    @javafx.fxml.FXML
    private TextField userNameField;
    @javafx.fxml.FXML
    private RadioButton highPriority;
    @javafx.fxml.FXML
    private Button submitButton;
    @javafx.fxml.FXML
    private TextArea descriptionArea;
    @javafx.fxml.FXML
    private TableView requestTable;
    @javafx.fxml.FXML
    private TableColumn userColumn;
    @javafx.fxml.FXML
    private TableColumn descriptionColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) {
    }
}