package com.spring26.section2.group17.bangladeshbank.MahmudulHasan.ForeignExchangeControlOfficer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXPolicyImplementationController {

    @FXML
    private Button btnPublish;
    @FXML
    private Label publishStatusLabel;
    @FXML
    private Button btnArchive;
    @FXML
    private Label validationLabel;
    @FXML
    private Button btnOpenPanel;
    @FXML
    private Button btnValidate;
    @FXML
    private TableView<Policy> policyTable;
    @FXML
    private TextField policyTitleField;
    @FXML
    private TextArea policyTextArea;
    @FXML
    private TableColumn<Policy, String> colId;
    @FXML
    private TableColumn<Policy, String> colTitle;
    @FXML
    private TextField policyIdField;
    @FXML
    private TableColumn<Policy, String> colStatus;

    private ObservableList<Policy> policyList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        // Bind table columns
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        policyTable.setItems(policyList);

        // Button actions
        btnOpenPanel.setOnAction(e -> handleOpenPanel());
        btnValidate.setOnAction(e -> handleValidate());
        btnPublish.setOnAction(e -> handlePublish());
        btnArchive.setOnAction(e -> handleArchive());
    }

    // Event 1
    private void handleOpenPanel() {
        clearFields();
        validationLabel.setText("Panel Opened");
        publishStatusLabel.setText("Not Published");
    }

    // Event 3
    private void handleValidate() {
        if (policyIdField.getText().isEmpty() ||
                policyTitleField.getText().isEmpty() ||
                policyTextArea.getText().isEmpty()) {

            validationLabel.setText("Validation Failed ❌");
        } else {
            validationLabel.setText("Valid Policy ✅");
        }
    }

    // Event 4
    private void handlePublish() {

        if (!validationLabel.getText().contains("Valid")) {
            publishStatusLabel.setText("Validate First ❗");
            return;
        }

        Policy policy = new Policy(
                policyIdField.getText(),
                policyTitleField.getText(),
                "Published"
        );

        policyList.add(policy);
        publishStatusLabel.setText("Published ✅");

        clearFields();
    }

    // Event 5
    private void handleArchive() {

        Policy selected = policyTable.getSelectionModel().getSelectedItem();

        if (selected != null) {
            selected.setStatus("Archived");
            policyTable.refresh();
            publishStatusLabel.setText("Archived 🗂");
        } else {
            publishStatusLabel.setText("Select Policy First ❗");
        }
    }

    private void clearFields() {
        policyIdField.clear();
        policyTitleField.clear();
        policyTextArea.clear();
    }
}