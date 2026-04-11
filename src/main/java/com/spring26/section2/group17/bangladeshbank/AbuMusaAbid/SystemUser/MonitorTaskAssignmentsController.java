package com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.SystemUser;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class MonitorTaskAssignmentsController {

    @FXML private TableView<Task> taskTable;

    @FXML private TableColumn<Task, String> taskIdColumn;
    @FXML private TableColumn<Task, String> descriptionColumn;
    @FXML private TableColumn<Task, String> deadlineColumn;
    @FXML private TableColumn<Task, String> statusColumn;

    @FXML private TextArea taskDetailsArea;

    private ObservableList<Task> taskList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        // Column binding
        taskIdColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        deadlineColumn.setCellValueFactory(new PropertyValueFactory<>("deadline"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Sample tasks
        taskList.addAll(
                new Task("T001", "Prepare Financial Report", "2026-04-15", "Pending",
                        "Prepare full quarterly financial report with charts."),
                new Task("T002", "Audit Budget Allocation", "2026-04-10", "In Progress",
                        "Review and audit all departmental budgets."),
                new Task("T003", "Revenue Analysis", "2026-04-20", "Completed",
                        "Analyze revenue growth and prepare summary."),
                new Task("T004", "Expense Monitoring", "2026-04-18", "Pending",
                        "Monitor and classify all expense transactions.")
        );

        taskTable.setItems(taskList);

        // Row selection listener
        taskTable.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSelection, newSelection) -> {
                    if (newSelection != null) {
                        taskDetailsArea.setText(
                                "Task ID: " + newSelection.getId() + "\n\n" +
                                        "Description: " + newSelection.getDescription() + "\n\n" +
                                        "Deadline: " + newSelection.getDeadline() + "\n\n" +
                                        "Status: " + newSelection.getStatus()
                        );
                    }
                }
        );

        taskDetailsArea.setText("Select a task to view details...");
    }

    @FXML
    public void BackButton_oas(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("AbuMusaAbid/SystemUser/Deshbord.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // =========================
    // MODEL CLASS
    // =========================
    public static class Task {

        private String id;
        private String description;
        private String deadline;
        private String status;
        private String details;

        public Task(String id, String description, String deadline, String status, String details) {
            this.id = id;
            this.description = description;
            this.deadline = deadline;
            this.status = status;
            this.details = details;
        }

        public String getId() { return id; }
        public String getDescription() { return description; }
        public String getDeadline() { return deadline; }
        public String getStatus() { return status; }
        public String getDetails() { return details; }
    }
}