module com.example.mycalcfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mycalcfx to javafx.fxml;
    exports com.example.mycalcfx;
}