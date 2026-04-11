package com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.SystemUser;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class TrackRequestStatusController {

    @FXML private TableView<Request> requestTable;

    @FXML private TableColumn<Request, String> idColumn;
    @FXML private TableColumn<Request, String> typeColumn;
    @FXML private TableColumn<Request, String> dateColumn;
    @FXML private TableColumn<Request, String> statusColumn;

    @FXML private TextArea timelineArea;

    private ObservableList<Request> requestList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        // Bind table columns
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Sample data
        requestList.addAll(
                new Request("R001", "Loan Request", "2026-04-01", "Pending",
                        "Submitted → Under Review → Waiting Approval"),
                new Request("R002", "Card Issue", "2026-04-03", "Approved",
                        "Submitted → Verified → Approved"),
                new Request("R003", "Account Update", "2026-04-05", "Rejected",
                        "Submitted → Checked → Rejected"),
                new Request("R004", "Fund Transfer", "2026-04-07", "Processing",
                        "Submitted → Processing → Completing")
        );

        requestTable.setItems(requestList);

        // Row selection listener
        requestTable.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSelection, newSelection) -> {
                    if (newSelection != null) {
                        timelineArea.setText(newSelection.getTimeline());
                    }
                }
        );

        timelineArea.setText("Select a request to view timeline...");
    }

    @FXML
    public void BackButton(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("AbuMusaAbid/SystemUser/Deshbord.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // =========================
    // MODEL CLASS
    // =========================
    public static class Request {

        private String id;
        private String type;
        private String date;
        private String status;
        private String timeline;

        public Request(String id, String type, String date, String status, String timeline) {
            this.id = id;
            this.type = type;
            this.date = date;
            this.status = status;
            this.timeline = timeline;
        }

        public String getId() { return id; }
        public String getType() { return type; }
        public String getDate() { return date; }
        public String getStatus() { return status; }
        public String getTimeline() { return timeline; }
    }
}