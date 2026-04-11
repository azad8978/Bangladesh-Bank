package com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.SystemUser;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ProvideFeedbackController {

    @FXML private Button submitButton;
    @FXML private TextField nameField;
    @FXML private TextField emailField;
    @FXML private TextArea feedbackArea;
    @FXML private Label confirmationLabel;

    @FXML
    public void initialize() {
        confirmationLabel.setText("");
    }

    @FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {

        String name = nameField.getText();
        String email = emailField.getText();
        String feedback = feedbackArea.getText();

        // ======================
        // VALIDATION
        // ======================
        if (name.isEmpty() || email.isEmpty() || feedback.isEmpty()) {
            confirmationLabel.setText("⚠ Please fill all fields!");
            return;
        }

        if (!email.contains("@") || !email.contains(".")) {
            confirmationLabel.setText("⚠ Invalid email format!");
            return;
        }

        if (feedback.length() < 10) {
            confirmationLabel.setText("⚠ Feedback too short!");
            return;
        }

        // ======================
        // SUCCESS ACTION
        // ======================
        confirmationLabel.setText("✅ Feedback submitted successfully!");

        // Clear form
        nameField.clear();
        emailField.clear();
        feedbackArea.clear();
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