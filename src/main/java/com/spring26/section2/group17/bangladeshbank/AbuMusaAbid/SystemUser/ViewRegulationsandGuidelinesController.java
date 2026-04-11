package com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.SystemUser;

import com.spring26.section2.group17.bangladeshbank.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

public class ViewRegulationsandGuidelinesController
{
    @javafx.fxml.FXML
    private TextArea documentContentArea;
    @javafx.fxml.FXML
    private Button viewButton;
    @javafx.fxml.FXML
    private ListView documentListView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void BackButton(ActionEvent actionEvent) {
        try {
            SceneSwitcher.switchTo("AbuMusaAbid/SystemUser/Deshbord.fxml");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}