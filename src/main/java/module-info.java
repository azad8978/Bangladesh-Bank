module com.spring26.section2.group17.bangladeshbank {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spring26.section2.group17.bangladeshbank to javafx.fxml;
    exports com.spring26.section2.group17.bangladeshbank;
    exports com.spring26.section2.group17.bangladeshbank.MahmudulHasan.PaymentSystemsOfficer;
    opens com.spring26.section2.group17.bangladeshbank.MahmudulHasan.PaymentSystemsOfficer to javafx.fxml;
}