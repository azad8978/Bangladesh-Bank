package com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.FinanceManager;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ApproveBudgetAllocationsController {

    @FXML
    private TableView<String[]> budgetTable;

    @FXML
    private TableColumn<String[], String> departmentColumn;

    @FXML
    private TableColumn<String[], String> requestedByColumn;

    @FXML
    private TableColumn<String[], String> purposeColumn;

    @FXML
    private TableColumn<String[], String> amountColumn;

    @FXML
    private Button approveButton;

    @FXML
    private Button rejectButton;

    @FXML
    private TextField commentField;

    @FXML
    private TextArea detailsArea;

    private ObservableList<String[]> budgetList;

    @FXML
    public void initialize() {


        departmentColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue()[0]));
        requestedByColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue()[1]));
        purposeColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue()[2]));
        amountColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue()[3]));

        budgetList = FXCollections.observableArrayList(
                new String[]{"IT", "Rahim", "System Upgrade", "50000"},
                new String[]{"HR", "Karim", "Training Program", "20000"},
                new String[]{"Finance", "Sakib", "Audit Cost", "30000"}
        );

        budgetTable.setItems(budgetList);

        budgetTable.getSelectionModel().selectedItemProperty().addListener((obs, oldItem, newItem) -> {
            if (newItem != null) {
                detailsArea.setText(
                        "Department: " + newItem[0] + "\n" +
                                "Requested By: " + newItem[1] + "\n" +
                                "Purpose: " + newItem[2] + "\n" +
                                "Amount: " + newItem[3]
                );
            }
        });
    }

    @FXML
    public void approveButton(ActionEvent event) {
        String[] selected = budgetTable.getSelectionModel().getSelectedItem();

        if (selected != null) {
            System.out.println("Approved: " + selected[2] + " | Comment: " + commentField.getText());
            budgetList.remove(selected);
            clearFields();
        } else {
            showAlert("Select a request first!");
        }
    }

    @FXML
    public void rejectButton(ActionEvent event) {
        String[] selected = budgetTable.getSelectionModel().getSelectedItem();

        if (selected != null) {
            System.out.println("Rejected: " + selected[2] + " | Comment: " + commentField.getText());
            budgetList.remove(selected);
            clearFields();
        } else {
            showAlert("Select a request first!");
        }
    }

    private void clearFields() {
        commentField.clear();
        detailsArea.clear();
    }

    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setContentText(msg);
        alert.showAndWait();
    }

    @FXML
    public void BackButton(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("AbuMusaAbid/FinanceManager/Deshbord.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}