module edu.okcu.calcfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.okcu.calcfx to javafx.fxml;
    exports edu.okcu.calcfx;
}