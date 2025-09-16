module edu.okcu.javafxsimplecalc {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.okcu.javafxsimplecalc to javafx.fxml;
    exports edu.okcu.javafxsimplecalc;
}