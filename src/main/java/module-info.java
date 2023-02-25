module com.example.team6777 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.team6777 to javafx.fxml;
    exports com.example.team6777;
}