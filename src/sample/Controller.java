package sample;

import java.awt.*;
import java.math.BigDecimal;
import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button first_button;

    @FXML
    private TextField first_date;

    @FXML
    private TextField second_date;

    @FXML
    private TextField first_date_compression_start;

    @FXML
    private TextField first_date_compression_end;

    @FXML
    private TextField first_date_compression_start1;

    @FXML
    private TextField first_date_compression_end1;

    @FXML
    private Button second_button;

    @FXML
    private Label first_result;

    @FXML
    private Label second_result;

    @FXML
    void initialize() {

        first_button.setOnAction(event -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate firstDate = LocalDate.parse(first_date.getText(), formatter);
            LocalDate secondDate = LocalDate.parse(second_date.getText(), formatter);
            long day = ChronoUnit.DAYS.between(firstDate, secondDate);
            double dayLeaving = day / 30.4166666666d * 2.33333333333d;
            BigDecimal dayLeavingBig = new BigDecimal(dayLeaving);
            first_result.setText(dayLeavingBig.setScale(1, BigDecimal.ROUND_CEILING) + " ");
        });

        second_button.setOnAction(event -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate firstDate = LocalDate.parse(first_date_compression_start.getText(), formatter);
            LocalDate secondDate = LocalDate.parse(first_date_compression_end.getText(), formatter);
//            LocalDate firstDate1 = LocalDate.parse(first_date_compression_start1.getText(), formatter);
//            LocalDate secondDate1 = LocalDate.parse(first_date_compression_end1.getText(), formatter);
            Period period = Period.between(firstDate, secondDate);
//            Period period1 = Period.between(firstDate1, secondDate1);


            second_result.setText((period.getDays() + " д. " + period.getMonths() + " мес. " + period.getYears() + " л. "));
        });

    }


}
