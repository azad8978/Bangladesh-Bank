package com.spring26.section2.group17.bangladeshbank.Towhid.DataAnalyst;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.*;

public class GenerateStatisticalSummariesController {

    @FXML private ComboBox<String> dataTypeComboBox;
    @FXML private Button generateButton;
    @FXML private CheckBox meanCheckBox;
    @FXML private CheckBox modeCheckBox;
    @FXML private TextArea inputDataArea;
    @FXML private CheckBox stdDevCheckBox;
    @FXML private TextArea resultArea;
    @FXML private Button statsButton;
    @FXML private CheckBox medianCheckBox;

    private ArrayList<Double> dataList = new ArrayList<>();

    @FXML
    public void initialize() {

        dataTypeComboBox.getItems().addAll("Security Logs", "Transactions", "User Activity");


        inputDataArea.setText("10,20,30,40,50,20,30");


        statsButton.setOnAction(this::handleStatistics);
    }


    @FXML
    public void handleStatistics(ActionEvent event) {

        dataList.clear();

        try {
            String input = inputDataArea.getText();

            if (input.isEmpty()) {
                resultArea.setText("⚠ Please enter data!");
                return;
            }


            String[] numbers = input.split(",");

            for (String num : numbers) {
                dataList.add(Double.parseDouble(num.trim()));
            }

            StringBuilder result = new StringBuilder();


            if (!meanCheckBox.isSelected() &&
                    !medianCheckBox.isSelected() &&
                    !modeCheckBox.isSelected() &&
                    !stdDevCheckBox.isSelected()) {

                resultArea.setText("⚠ Select at least one metric!");
                return;
            }


            if (meanCheckBox.isSelected()) {
                result.append("Mean: ").append(String.format("%.2f", calculateMean())).append("\n");
            }

            if (medianCheckBox.isSelected()) {
                result.append("Median: ").append(calculateMedian()).append("\n");
            }

            if (modeCheckBox.isSelected()) {
                result.append("Mode: ").append(calculateMode()).append("\n");
            }

            if (stdDevCheckBox.isSelected()) {
                result.append("Std Dev: ").append(String.format("%.2f", calculateStdDev())).append("\n");
            }

            resultArea.setText(result.toString());

        } catch (Exception e) {
            resultArea.setText("❌ Invalid input! Use format: 10,20,30");
        }
    }


    private double calculateMean() {
        double sum = 0;
        for (double num : dataList) sum += num;
        return sum / dataList.size();
    }


    private double calculateMedian() {
        Collections.sort(dataList);
        int size = dataList.size();

        if (size % 2 == 0) {
            return (dataList.get(size/2 - 1) + dataList.get(size/2)) / 2;
        }
        return dataList.get(size/2);
    }


    private double calculateMode() {
        Map<Double, Integer> map = new HashMap<>();

        for (double num : dataList) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        double mode = 0;
        int max = 0;

        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }

    private double calculateStdDev() {
        double mean = calculateMean();
        double sum = 0;

        for (double num : dataList) {
            sum += Math.pow(num - mean, 2);
        }

        return Math.sqrt(sum / dataList.size());
    }


    @FXML
    public void ButtonOA(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("Towhid/DataAnalyst/DashboardDA.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}