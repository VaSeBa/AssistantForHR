package sample;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.ResourceBundle;


public class Controller {
    public static long DAYS = 0;

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
    private TextField first_date_compression_end2;

    @FXML
    private TextField first_date_compression_start2;

    @FXML
    private TextField first_date_compression_start3;

    @FXML
    private TextField first_date_compression_start4;

    @FXML
    private TextField first_date_compression_end5;

    @FXML
    private TextField first_date_compression_end3;

    @FXML
    private TextField first_date_compression_end4;

    @FXML
    private TextField first_date_compression_start5;

    @FXML
    private TextField first_date_compression_start6;

    @FXML
    private TextField first_date_compression_end6;

    @FXML
    private Button second_button;

    @FXML
    private TextField first_date_compression_start7;

    @FXML
    private TextField first_date_compression_end7;

    @FXML
    private TextField first_date_compression_start8;

    @FXML
    private TextField first_date_compression_end8;

    @FXML
    private Label first_result;

    @FXML
    private Label second_result;

    @FXML
    private Label time;

    @FXML
    private CheckBox box;

    @FXML
    private CheckBox box1;

    @FXML
    private Label second_result1;

    @FXML
    private CheckBox box2;

    @FXML
    private Label second_result2;

    @FXML
    private Label result_sum;

    @FXML
    private CheckBox box3;

    @FXML
    private CheckBox box4;

    @FXML
    private CheckBox box5;

    @FXML
    private CheckBox box6;

    @FXML
    private CheckBox box7;

    @FXML
    private CheckBox box8;

    @FXML
    private Label second_result3;

    @FXML
    private Label second_result4;

    @FXML
    private Label second_result5;

    @FXML
    private Label second_result6;

    @FXML
    private Label second_result7;

    @FXML
    private Label second_result8;

    @FXML
    private JFXButton clockBtn;

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

            if (box.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end.getText(), formatter);
                DAYS = ChronoUnit.DAYS.between(firstDate, secondDate);
                result_sum.setText(DAYS + " д.");
            }
            if (box1.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start1.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end1.getText(), formatter);
                DAYS += ChronoUnit.DAYS.between(firstDate, secondDate);
                result_sum.setText(DAYS + " д.");
            }
            if (box2.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start2.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end2.getText(), formatter);
                DAYS += ChronoUnit.DAYS.between(firstDate, secondDate);
                result_sum.setText(DAYS + " д.");
            }
            if (box3.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start3.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end3.getText(), formatter);
                DAYS += ChronoUnit.DAYS.between(firstDate, secondDate);
                result_sum.setText(DAYS + " д.");
            }
            if (box4.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start4.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end4.getText(), formatter);
                DAYS += ChronoUnit.DAYS.between(firstDate, secondDate);
                result_sum.setText(DAYS + " д.");
            }
            if (box5.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start5.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end5.getText(), formatter);
                DAYS += ChronoUnit.DAYS.between(firstDate, secondDate);
                result_sum.setText(DAYS + " д.");
            }
            if (box6.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start6.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end6.getText(), formatter);
                DAYS += ChronoUnit.DAYS.between(firstDate, secondDate);
                result_sum.setText(DAYS + " д.");
            }
            if (box7.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start7.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end7.getText(), formatter);
                DAYS += ChronoUnit.DAYS.between(firstDate, secondDate);
                result_sum.setText(DAYS + " д.");
            }
            if (box8.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start8.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end8.getText(), formatter);
                DAYS += ChronoUnit.DAYS.between(firstDate, secondDate);
                result_sum.setText(DAYS + " д.");
            }

            workExperience(formatter, box, first_date_compression_start, first_date_compression_end, second_result);
            workExperience(formatter, box1, first_date_compression_start1, first_date_compression_end1, second_result1);
            workExperience(formatter, box2, first_date_compression_start2, first_date_compression_end2, second_result2);
            workExperience(formatter, box3, first_date_compression_start3, first_date_compression_end3, second_result3);
            workExperience(formatter, box4, first_date_compression_start4, first_date_compression_end4, second_result4);
            workExperience(formatter, box5, first_date_compression_start5, first_date_compression_end5, second_result5);
            workExperience(formatter, box6, first_date_compression_start6, first_date_compression_end6, second_result6);
            workExperience(formatter, box7, first_date_compression_start7, first_date_compression_end7, second_result7);
            workExperience(formatter, box8, first_date_compression_start8, first_date_compression_end8, second_result8);

        });


        Date date = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        time.setText(format1.format(date));

    }

    private void workExperience (DateTimeFormatter formatter, CheckBox box1, TextField first_date_compression_start1, TextField first_date_compression_end1, Label second_result1) {
        if (box1.isSelected()) {
            LocalDate firstDate1 = LocalDate.parse(first_date_compression_start1.getText(), formatter);
            LocalDate secondDate1 = LocalDate.parse(first_date_compression_end1.getText(), formatter);
            Period period1 = Period.between(firstDate1, secondDate1);
            second_result1.setText((period1.getDays() + " д. " + period1.getMonths() + " м. " + period1.getYears() + " л. "));
        }
    }


}
