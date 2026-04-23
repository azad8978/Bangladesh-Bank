package com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.SystemUser;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.HashMap;
import java.util.Map;

public class ViewRegulationsandGuidelinesController {

    @FXML
    private TextArea documentContentArea;

    @FXML
    private Button viewButton;

    @FXML
    private ListView<String> documentListView;

    private Map<String, String> documentMap;

    @FXML
    public void initialize() {

        documentMap = new HashMap<>();
        documentMap.put("Banking Regulation Act",
                "This act governs all banking operations...\n\nRules:\n1. Maintain liquidity\n2. Follow compliance");
        documentMap.put("Loan Policy Guidelines",
                "Loan policy defines how loans are issued...\n\nSteps:\n1. Verify documents\n2. Approve credit");
        documentMap.put("Cyber Security Policy",
                "Ensure protection of financial data...\n\nRules:\n1. Use strong passwords\n2. Monitor threats");
        documentMap.put("KYC Guidelines",
                "Know Your Customer policy...\n\nSteps:\n1. Verify identity\n2. Maintain records");

        ObservableList<String> list = FXCollections.observableArrayList(documentMap.keySet());
        documentListView.setItems(list);

        viewButton.setOnAction(this::viewDocument);
        documentListView.setOnMouseClicked(e -> {
            if (e.getClickCount() == 2) {
                viewSelected();
            }
        });
    }

    private void viewDocument(ActionEvent event) {
        viewSelected();
    }

    private void viewSelected() {

        String selected = documentListView.getSelectionModel().getSelectedItem();

        if (selected != null) {
            documentContentArea.setText(documentMap.get(selected));
        } else {
            showAlert("Please select a document!");
        }
    }

    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setContentText(msg);
        alert.showAndWait();
    }

    @FXML
    public void BackButton(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("AbuMusaAbid/SystemUser/Deshbord.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}