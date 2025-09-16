module edu.okcu.cs.jmaxwell.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.okcu.cs.jmaxwell.javafxdemo to javafx.fxml;
    exports edu.okcu.cs.jmaxwell.javafxdemo;
}