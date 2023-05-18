module com.example.gachademo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gachademo to javafx.fxml;
    exports com.example.gachademo;
}