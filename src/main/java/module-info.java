module com.example.team6777 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens com.example.team6777 to javafx.fxml;
    exports com.example.team6777;
}