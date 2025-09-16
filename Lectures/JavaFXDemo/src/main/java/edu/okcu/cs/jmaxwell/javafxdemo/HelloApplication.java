package edu.okcu.cs.jmaxwell.javafxdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();
        final Scene scene = new Scene(pane, 300, 250);
        stage.setScene(scene);

        Path path = new Path();
        MoveTo moveTo = new MoveTo(100, 100);
        LineTo line1 = new LineTo(321, 161);
        LineTo line2 = new LineTo(126, 232);
        LineTo line3 = new LineTo(232, 52);
        LineTo line4 = new LineTo(269, 250);
        LineTo line5 = new LineTo(100, 100);
        path.getElements().add(moveTo);
        path.getElements().addAll(line1, line2, line3, line4, line5);

        pane.getChildren().add(path);

        Text text = new Text(100, 100, "Hello World");
        Font font = new Font("Arial", 50);
        text.setFont(font);

        pane.getChildren().add(text);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}