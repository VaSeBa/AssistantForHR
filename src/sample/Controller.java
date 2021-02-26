package sample;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import sample.calc2.DigitalWatch;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;


public class Controller {

    @FXML
    private JFXButton clockBtn;

    @FXML
    private ImageView calc;

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
    private Button calc_button;

    private static long DAYS = 0;
    private static long day = 0;
    private static long muns = 0;
    private static long year = 0;
    private List<Period> periodList;

    @FXML
    void initialize() {


        calc_button.setOnAction(event -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/calc2/calcFX.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });


        /**
        М0 : 12 = Ку : К0, где
        Мо — количество месяцев, отработанных работником;
        12 — количество месяцев в году;
        Ку — количество дней отпуска, на которые работник получил право к моменту увольнения;
        Ко — количество дней ежегодного оплачиваемого отпуска работника.
        Таким образом, количество дней отпуска, заработанных работником, определяется по следующей формуле:
        Ку = (М0 * К0 ) : 12
         */
        first_button.setOnAction(event -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate firstDate = LocalDate.parse(first_date.getText(), formatter);
            LocalDate secondDate = LocalDate.parse(second_date.getText(), formatter);
            double month = ChronoUnit.MONTHS.between(firstDate, secondDate);
            long day = ChronoUnit.DAYS.between(firstDate, secondDate);
            double  value = ((28 * month) / 12);
//            double dayLeaving = day / 9d;
//            BigDecimal dayLeavingBig = new BigDecimal(muns);
//            first_result.setText(dayLeavingBig.setScale(1, BigDecimal.ROUND_CEILING) + " ");
            first_result.setText(String.format("%.2f", value));
        });

        second_button.setOnAction(event -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

            if (box.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end.getText(), formatter);

                Period period = Period.between(firstDate, secondDate);

                result_sum.setText(period.getDays() + " д. " + period.getMonths() + " м. " + period.getYears() + " л. ");


            }

            if (box1.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end.getText(), formatter);
                LocalDate firstDate1 = LocalDate.parse(first_date_compression_start1.getText(), formatter);
                LocalDate secondDate1 = LocalDate.parse(first_date_compression_end1.getText(), formatter);

                Period period = Period.between(firstDate, secondDate);
                Period period1 = Period.between(firstDate1, secondDate1);
                Period total = period.plus(period1);
                LocalDate today = LocalDate.now();
                today = today.plusDays(total.getDays()).plusMonths(total.getMonths()).plusYears(total.getYears());
                total = LocalDate.now().until(today);
                result_sum.setText(total.getDays() + " д. " + total.getMonths() + " м. " + total.getYears() + " л. ");


            }

            if (box2.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end.getText(), formatter);
                LocalDate firstDate1 = LocalDate.parse(first_date_compression_start1.getText(), formatter);
                LocalDate secondDate1 = LocalDate.parse(first_date_compression_end1.getText(), formatter);
                LocalDate firstDate2 = LocalDate.parse(first_date_compression_start2.getText(), formatter);
                LocalDate secondDate2 = LocalDate.parse(first_date_compression_end2.getText(), formatter);
                Period period = Period.between(firstDate, secondDate);
                Period period1 = Period.between(firstDate1, secondDate1);
                Period period2 = Period.between(firstDate2, secondDate2);
                Period total = period.plus(period1).plus(period2);
                LocalDate today = LocalDate.now();
                today = today.plusDays(total.getDays()).plusMonths(total.getMonths()).plusYears(total.getYears());
                total = LocalDate.now().until(today);
                result_sum.setText(total.getDays() + " д. " + total.getMonths() + " м. " + total.getYears() + " л. ");

            }

            if (box3.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end.getText(), formatter);
                LocalDate firstDate1 = LocalDate.parse(first_date_compression_start1.getText(), formatter);
                LocalDate secondDate1 = LocalDate.parse(first_date_compression_end1.getText(), formatter);
                LocalDate firstDate2 = LocalDate.parse(first_date_compression_start2.getText(), formatter);
                LocalDate secondDate2 = LocalDate.parse(first_date_compression_end2.getText(), formatter);
                LocalDate firstDate3 = LocalDate.parse(first_date_compression_start3.getText(), formatter);
                LocalDate secondDate3 = LocalDate.parse(first_date_compression_end3.getText(), formatter);
                Period period = Period.between(firstDate, secondDate);
                Period period1 = Period.between(firstDate1, secondDate1);
                Period period2 = Period.between(firstDate2, secondDate2);
                Period period3 = Period.between(firstDate3, secondDate3);

                Period total = period.plus(period1).plus(period2).plus(period3);
                LocalDate today = LocalDate.now();
                today = today.plusDays(total.getDays()).plusMonths(total.getMonths()).plusYears(total.getYears());
                total = LocalDate.now().until(today);
                result_sum.setText(total.getDays() + " д. " + total.getMonths() + " м. " + total.getYears() + " л. ");

            }

            if (box4.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end.getText(), formatter);
                LocalDate firstDate1 = LocalDate.parse(first_date_compression_start1.getText(), formatter);
                LocalDate secondDate1 = LocalDate.parse(first_date_compression_end1.getText(), formatter);
                LocalDate firstDate2 = LocalDate.parse(first_date_compression_start2.getText(), formatter);
                LocalDate secondDate2 = LocalDate.parse(first_date_compression_end2.getText(), formatter);
                LocalDate firstDate3 = LocalDate.parse(first_date_compression_start3.getText(), formatter);
                LocalDate secondDate3 = LocalDate.parse(first_date_compression_end3.getText(), formatter);
                LocalDate firstDate4 = LocalDate.parse(first_date_compression_start4.getText(), formatter);
                LocalDate secondDate4 = LocalDate.parse(first_date_compression_end4.getText(), formatter);
                Period period = Period.between(firstDate, secondDate);
                Period period1 = Period.between(firstDate1, secondDate1);
                Period period2 = Period.between(firstDate2, secondDate2);
                Period period3 = Period.between(firstDate3, secondDate3);
                Period period4 = Period.between(firstDate4, secondDate4);

                Period total = period.plus(period1).plus(period2).plus(period3).plus(period4);
                LocalDate today = LocalDate.now();
                today = today.plusDays(total.getDays()).plusMonths(total.getMonths()).plusYears(total.getYears());
                total = LocalDate.now().until(today);
                result_sum.setText(total.getDays() + " д. " + total.getMonths() + " м. " + total.getYears() + " л. ");

            }

            if (box5.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end.getText(), formatter);
                LocalDate firstDate1 = LocalDate.parse(first_date_compression_start1.getText(), formatter);
                LocalDate secondDate1 = LocalDate.parse(first_date_compression_end1.getText(), formatter);
                LocalDate firstDate2 = LocalDate.parse(first_date_compression_start2.getText(), formatter);
                LocalDate secondDate2 = LocalDate.parse(first_date_compression_end2.getText(), formatter);
                LocalDate firstDate3 = LocalDate.parse(first_date_compression_start3.getText(), formatter);
                LocalDate secondDate3 = LocalDate.parse(first_date_compression_end3.getText(), formatter);
                LocalDate firstDate4 = LocalDate.parse(first_date_compression_start4.getText(), formatter);
                LocalDate secondDate4 = LocalDate.parse(first_date_compression_end4.getText(), formatter);
                LocalDate firstDate5 = LocalDate.parse(first_date_compression_start5.getText(), formatter);
                LocalDate secondDate5 = LocalDate.parse(first_date_compression_end5.getText(), formatter);
                Period period = Period.between(firstDate, secondDate);
                Period period1 = Period.between(firstDate1, secondDate1);
                Period period2 = Period.between(firstDate2, secondDate2);
                Period period3 = Period.between(firstDate3, secondDate3);
                Period period4 = Period.between(firstDate4, secondDate4);
                Period period5 = Period.between(firstDate5, secondDate5);

                Period total = period.plus(period1).plus(period2).plus(period3).plus(period4).plus(period5);
                LocalDate today = LocalDate.now();
                today = today.plusDays(total.getDays()).plusMonths(total.getMonths()).plusYears(total.getYears());
                total = LocalDate.now().until(today);
                result_sum.setText(total.getDays() + " д. " + total.getMonths() + " м. " + total.getYears() + " л. ");

            }

            if (box6.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end.getText(), formatter);
                LocalDate firstDate1 = LocalDate.parse(first_date_compression_start1.getText(), formatter);
                LocalDate secondDate1 = LocalDate.parse(first_date_compression_end1.getText(), formatter);
                LocalDate firstDate2 = LocalDate.parse(first_date_compression_start2.getText(), formatter);
                LocalDate secondDate2 = LocalDate.parse(first_date_compression_end2.getText(), formatter);
                LocalDate firstDate3 = LocalDate.parse(first_date_compression_start3.getText(), formatter);
                LocalDate secondDate3 = LocalDate.parse(first_date_compression_end3.getText(), formatter);
                LocalDate firstDate4 = LocalDate.parse(first_date_compression_start4.getText(), formatter);
                LocalDate secondDate4 = LocalDate.parse(first_date_compression_end4.getText(), formatter);
                LocalDate firstDate5 = LocalDate.parse(first_date_compression_start5.getText(), formatter);
                LocalDate secondDate5 = LocalDate.parse(first_date_compression_end5.getText(), formatter);
                LocalDate firstDate6 = LocalDate.parse(first_date_compression_start6.getText(), formatter);
                LocalDate secondDate6 = LocalDate.parse(first_date_compression_end6.getText(), formatter);
                Period period = Period.between(firstDate, secondDate);
                Period period1 = Period.between(firstDate1, secondDate1);
                Period period2 = Period.between(firstDate2, secondDate2);
                Period period3 = Period.between(firstDate3, secondDate3);
                Period period4 = Period.between(firstDate4, secondDate4);
                Period period5 = Period.between(firstDate5, secondDate5);
                Period period6 = Period.between(firstDate6, secondDate6);
                Period total = period.plus(period1).plus(period2).plus(period3).plus(period4).plus(period5).plus(period6);
                LocalDate today = LocalDate.now();
                today = today.plusDays(total.getDays()).plusMonths(total.getMonths()).plusYears(total.getYears());
                total = LocalDate.now().until(today);
                result_sum.setText(total.getDays() + " д. " + total.getMonths() + " м. " + total.getYears() + " л. ");
            }

            if (box7.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end.getText(), formatter);
                LocalDate firstDate1 = LocalDate.parse(first_date_compression_start1.getText(), formatter);
                LocalDate secondDate1 = LocalDate.parse(first_date_compression_end1.getText(), formatter);
                LocalDate firstDate2 = LocalDate.parse(first_date_compression_start2.getText(), formatter);
                LocalDate secondDate2 = LocalDate.parse(first_date_compression_end2.getText(), formatter);
                LocalDate firstDate3 = LocalDate.parse(first_date_compression_start3.getText(), formatter);
                LocalDate secondDate3 = LocalDate.parse(first_date_compression_end3.getText(), formatter);
                LocalDate firstDate4 = LocalDate.parse(first_date_compression_start4.getText(), formatter);
                LocalDate secondDate4 = LocalDate.parse(first_date_compression_end4.getText(), formatter);
                LocalDate firstDate5 = LocalDate.parse(first_date_compression_start5.getText(), formatter);
                LocalDate secondDate5 = LocalDate.parse(first_date_compression_end5.getText(), formatter);
                LocalDate firstDate6 = LocalDate.parse(first_date_compression_start6.getText(), formatter);
                LocalDate secondDate6 = LocalDate.parse(first_date_compression_end6.getText(), formatter);
                LocalDate firstDate7 = LocalDate.parse(first_date_compression_start7.getText(), formatter);
                LocalDate secondDate7 = LocalDate.parse(first_date_compression_end7.getText(), formatter);
                Period period = Period.between(firstDate, secondDate);
                Period period1 = Period.between(firstDate1, secondDate1);
                Period period2 = Period.between(firstDate2, secondDate2);
                Period period3 = Period.between(firstDate3, secondDate3);
                Period period4 = Period.between(firstDate4, secondDate4);
                Period period5 = Period.between(firstDate5, secondDate5);
                Period period6 = Period.between(firstDate6, secondDate6);
                Period period7 = Period.between(firstDate7, secondDate7);
                Period total = period.plus(period1).plus(period2).plus(period3).plus(period4).plus(period5).plus(period6).plus(period7);
                LocalDate today = LocalDate.now();
                today = today.plusDays(total.getDays()).plusMonths(total.getMonths()).plusYears(total.getYears());
                total = LocalDate.now().until(today);
                result_sum.setText(total.getDays() + " д. " + total.getMonths() + " м. " + total.getYears() + " л. ");

            }

            if (box8.isSelected()) {
                LocalDate firstDate = LocalDate.parse(first_date_compression_start.getText(), formatter);
                LocalDate secondDate = LocalDate.parse(first_date_compression_end.getText(), formatter);
                LocalDate firstDate1 = LocalDate.parse(first_date_compression_start1.getText(), formatter);
                LocalDate secondDate1 = LocalDate.parse(first_date_compression_end1.getText(), formatter);
                LocalDate firstDate2 = LocalDate.parse(first_date_compression_start2.getText(), formatter);
                LocalDate secondDate2 = LocalDate.parse(first_date_compression_end2.getText(), formatter);
                LocalDate firstDate3 = LocalDate.parse(first_date_compression_start3.getText(), formatter);
                LocalDate secondDate3 = LocalDate.parse(first_date_compression_end3.getText(), formatter);
                LocalDate firstDate4 = LocalDate.parse(first_date_compression_start4.getText(), formatter);
                LocalDate secondDate4 = LocalDate.parse(first_date_compression_end4.getText(), formatter);
                LocalDate firstDate5 = LocalDate.parse(first_date_compression_start5.getText(), formatter);
                LocalDate secondDate5 = LocalDate.parse(first_date_compression_end5.getText(), formatter);
                LocalDate firstDate6 = LocalDate.parse(first_date_compression_start6.getText(), formatter);
                LocalDate secondDate6 = LocalDate.parse(first_date_compression_end6.getText(), formatter);
                LocalDate firstDate7 = LocalDate.parse(first_date_compression_start7.getText(), formatter);
                LocalDate secondDate7 = LocalDate.parse(first_date_compression_end7.getText(), formatter);
                LocalDate firstDate8 = LocalDate.parse(first_date_compression_start8.getText(), formatter);
                LocalDate secondDate8 = LocalDate.parse(first_date_compression_end8.getText(), formatter);
                Period period = Period.between(firstDate, secondDate);
                Period period1 = Period.between(firstDate1, secondDate1);
                Period period2 = Period.between(firstDate2, secondDate2);
                Period period3 = Period.between(firstDate3, secondDate3);
                Period period4 = Period.between(firstDate4, secondDate4);
                Period period5 = Period.between(firstDate5, secondDate5);
                Period period6 = Period.between(firstDate6, secondDate6);
                Period period7 = Period.between(firstDate7, secondDate7);
                Period period8 = Period.between(firstDate8, secondDate8);
                Period total = period.plus(period1).plus(period2).plus(period3).plus(period4).plus(period5).plus(period6).plus(period7).plus(period8);
                LocalDate today = LocalDate.now();
                today = today.plusDays(total.getDays()).plusMonths(total.getMonths()).plusYears(total.getYears());
                total = LocalDate.now().until(today);
                result_sum.setText(total.getDays() + " д. " + total.getMonths() + " м. " + total.getYears() + " л. ");

//                result_sum.setText(period.plus(period1).plus(period2).plus(period3).plus(period4).plus(period5).plus(period6).plus(period7).plus(period8).getDays() +
//                        " д. " + period.plus(period1).plus(period2).plus(period3).plus(period4).plus(period5).plus(period6).plus(period7).plus(period8).getMonths() +
//                        " м. " + period.plus(period1).plus(period2).plus(period3).plus(period4).plus(period5).plus(period6).plus(period7).plus(period8).getYears() + " л. ");
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

        new DigitalWatch(clockBtn);
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
