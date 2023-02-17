module com.lnnd.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.lnnd.bmiapp to javafx.fxml;
    exports com.lnnd.bmiapp;
}
