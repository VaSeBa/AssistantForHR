package sample;

/**
 Программа для HR -
 1. подсчет ежегодного отпуска за период
 2. подсчет периода между датами

 HR program -
 1.calculation of annual leave for a period
 2.counting the period between dates

 project from VaSeBa
 02/12/2020
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static final String IMAGE_LOC = "/sample/calc2/fonts/Calculator-icon.png";
    public static final int WIND_WIDTH = 518;
    public static final int WIND_HEIGHT = 646;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Assistant for you");
        primaryStage.setScene(new Scene(root, 700, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
