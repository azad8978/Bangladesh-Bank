package com.spring26.section2.group17.bangladeshbank;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static com.spring26.section2.group17.bangladeshbank.SceneSwitcher.stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage1) throws IOException {
        stage=stage1;
        stage=stage1;


//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group17/bangladeshbank/MahmudulHasan/PaymentSystemsOfficer/MonitorFraud&Risk.fxml"));

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("Towhid/Dashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Bangladesh Bank");
        stage.setScene(scene);
        stage.show();
    }

    public static Stage getPrimaryStage() {return stage;}

    public static void main(String[] args) {launch();}
}