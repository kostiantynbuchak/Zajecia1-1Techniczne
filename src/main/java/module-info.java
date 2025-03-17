module com.example.zaj1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zaj1 to javafx.fxml;
    exports com.example.zaj1;
}