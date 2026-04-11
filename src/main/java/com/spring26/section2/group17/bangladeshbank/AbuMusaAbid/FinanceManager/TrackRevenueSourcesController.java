package com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.FinanceManager;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.beans.property.SimpleStringProperty;

public class TrackRevenueSourcesController {

    @FXML
    private TextField toDateField;

    @FXML
    private ComboBox<String> sourceComboBox;

    @FXML
    private TableView<String[]> revenueTable;

    @FXML
    private Label totalRevenueLabel;

    @FXML
    private TextField fromDateField;

    @FXML
    private TableColumn<String[], String> amountColumn;

    @FXML
    private TableColumn<String[], String> sourceNameColumn;

    @FXML
    private TableColumn<String[], String> dateColumn;

    @FXML
    private Button filterButton;

    private ObservableList<String[]> revenueList;

    @FXML
    public void initialize() {

        // Set column mapping
        sourceNameColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue()[0]));
        amountColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue()[1]));
        dateColumn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue()[2]));

        // ComboBox values
        sourceComboBox.setItems(FXCollections.observableArrayList(
                "All", "Tax", "Investment", "Service Fees"
        ));
        sourceComboBox.setValue("All");

        // Sample data
        revenueList = FXCollections.observableArrayList(
                new String[]{"Tax", "50000", "2026-04-01"},
                new String[]{"Investment", "30000", "2026-04-02"},
                new String[]{"Service Fees", "15000", "2026-04-03"},
                new String[]{"Tax", "20000", "2026-04-04"}
        );

        revenueTable.setItems(revenueList);

        // Calculate total
        calculateTotal(revenueList);
    }

    @FXML
    public void filterButton(ActionEvent event) {

        String selectedSource = sourceComboBox.getValue();
        String fromDate = fromDateField.getText();
        String toDate = toDateField.getText();

        ObservableList<String[]> filteredList = FXCollections.observableArrayList();

        for (String[] row : revenueList) {

            boolean matchSource = selectedSource.equals("All") || row[0].equals(selectedSource);

            boolean matchDate = true;

            // Simple date filtering (string compare works for YYYY-MM-DD)
            if (!fromDate.isEmpty() && row[2].compareTo(fromDate) < 0) {
                matchDate = false;
            }
            if (!toDate.isEmpty() && row[2].compareTo(toDate) > 0) {
                matchDate = false;
            }

            if (matchSource && matchDate) {
                filteredList.add(row);
            }
        }

        revenueTable.setItems(filteredList);
        calculateTotal(filteredList);
    }

    private void calculateTotal(ObservableList<String[]> list) {
        double total = 0;

        for (String[] row : list) {
            total += Double.parseDouble(row[1]);
        }

        totalRevenueLabel.setText("Total: " + total);
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