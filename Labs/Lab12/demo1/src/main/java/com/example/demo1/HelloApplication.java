package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Pane pane = new Pane();
        final Scene scene = new Scene(pane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Initials");
        primaryStage.setScene(scene);
        primaryStage.show();

        //B
        Path path = new Path();
        MoveTo moveTo = new MoveTo(10, 30);
        LineTo line1 = new LineTo(10, 60);
        LineTo line2 = new LineTo(10, 90);
        LineTo line3 = new LineTo(50, 90);
        LineTo line4 = new LineTo(50, 60);
        LineTo line5 = new LineTo(10,60);
        LineTo line6 = new LineTo(10, 30);
        LineTo line7 = new LineTo(50, 30);
        LineTo line8 = new LineTo (50, 60);
        path.getElements().add(moveTo);

// space
        Path path1 = new Path();
        MoveTo moveTo1 = new MoveTo(60, 30);

        //D


        LineTo line9 = new LineTo(60, 30);
        LineTo line10 = new LineTo(100, 30);
        LineTo line11 = new LineTo(100, 70);
        LineTo line12 = new LineTo(100, 90);
        LineTo line13 = new LineTo(60, 90);
        LineTo line14 = new LineTo(60,30);
        path1.getElements().add(moveTo1);
        path.getElements().addAll(line1, line2, line3, line4, line5, line6, line7, line8);
        path1.getElements().addAll(line9, line10, line11, line12, line13, line14);

        pane.getChildren().add(path);
        pane.getChildren().add(path1);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}