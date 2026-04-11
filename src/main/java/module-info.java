module com.spring26.section2.group17.bangladeshbank {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spring26.section2.group17.bangladeshbank to javafx.fxml;
    opens com.spring26.section2.group17.bangladeshbank.Towhid.CyberSecurityOfficer to javafx.fxml;
    opens com.spring26.section2.group17.bangladeshbank.Towhid.DataAnalyst to javafx.fxml;
    opens com.spring26.section2.group17.bangladeshbank.MahmudulHasan.PaymentSystemsOfficer to javafx.fxml;
    opens com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.FinanceManager to javafx.fxml;
    opens com.spring26.section2.group17.bangladeshbank.AbuMusaAbid.SystemUser to javafx.fxml;



    opens com.spring26.section2.group17.bangladeshbank.Towhid to javafx.fxml;

    exports com.spring26.section2.group17.bangladeshbank;
}