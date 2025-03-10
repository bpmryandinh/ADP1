module edu.okcu.calculatorfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.okcu.calculatorfx to javafx.fxml;
    exports edu.okcu.calculatorfx;
}