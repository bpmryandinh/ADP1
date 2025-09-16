module edu.okcu.guessfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.okcu.guessfx to javafx.fxml;
    exports edu.okcu.guessfx;
}