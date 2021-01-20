package sample.calculator;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Calculator implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton dzero;

    @FXML
    private JFXButton seven;

    @FXML
    private JFXButton nine;

    @FXML
    private JFXButton eight;

    @FXML
    private JFXButton one;

    @FXML
    private JFXButton six;

    @FXML
    private JFXButton five;

    @FXML
    private JFXButton four;

    @FXML
    private JFXButton three;

    @FXML
    private JFXButton two;

    @FXML
    private JFXButton equal;

    @FXML
    private JFXButton point;

    @FXML
    private JFXButton zero;

    @FXML
    private JFXButton multy;

    @FXML
    private JFXButton kum;

    @FXML
    private JFXButton ko;

    @FXML
    private JFXButton dabash;

    @FXML
    private JFXButton clear;

    @FXML
    private JFXTextField input;

    @FXML
    private Label prom;

    private long fnumber;
    private long snumber;

    private String operation;


    @Override
    public void initialize(URL url, ResourceBundle rb) {


    }
    public void point_click() {
        String oldvalue = input.getText();
        String set = ".";
        input.setText(oldvalue + set);
    }

    public void zero_click() {
        String oldvalue = input.getText();
        String set = "0";
        input.setText(oldvalue + set);
    }

    public void one_click() {
        String oldvalue = input.getText();
        String set = "1";
        input.setText(oldvalue + set);
    }

    public void two_click() {
        String oldvalue = input.getText();
        String set = "2";
        input.setText(oldvalue + set);
    }

    public void three_click() {
        String oldvalue = input.getText();
        String set = "3";
        input.setText(oldvalue + set);
    }

    public void four_click() {
        String oldvalue = input.getText();
        String set = "4";
        input.setText(oldvalue + set);
    }

    public void five_click() {
        String oldvalue = input.getText();
        String set = "5";
        input.setText(oldvalue + set);
    }

    public void six_click() {
        String oldvalue = input.getText();
        String set = "6";
        input.setText(oldvalue + set);
    }

    public void seven_click() {
        String oldvalue = input.getText();
        String set = "7";
        input.setText(oldvalue + set);
    }

    public void eight_click() {
        String oldvalue = input.getText();
        String set = "8";
        input.setText(oldvalue + set);
    }

    public void nine_click() {
        String oldvalue = input.getText();
        String set = "9";
        input.setText(oldvalue + set);
    }

    public void ko_click() {
        String value = input.getText();
        long valuenumber = Integer.parseInt(value);
        this.fnumber = valuenumber;
        input.setText("");
        prom.setText(value + "+");
        operation = "+";
    }

    public void kum_click() {
        String value = input.getText();
        long valuenumber = Integer.parseInt(value);
        this.fnumber = valuenumber;
        input.setText("");
        prom.setText(value + "-");
        operation = "-";
    }

    public void multy_click() {
        String value = input.getText();
        long valuenumber = Integer.parseInt(value);
        this.fnumber = valuenumber;
        input.setText("");
        prom.setText(value + "x");
        operation = "x";
    }

    public void dabash_click() {
        String value = input.getText();
        long valuenumber = Integer.parseInt(value);
        this.fnumber = valuenumber;
        input.setText("");
        prom.setText(value + "/");
        operation = "/";
    }

    public void clear_click() {
         input.setText("");
         prom.setText("");
         this.snumber = 0;
         this.fnumber = 0;
    }

    public void equal_click() {
        switch (operation){
            case "+":
                String value = input.getText();
                this.snumber = Integer.parseInt(value);
                long system = this.fnumber + this.snumber;
                input.setText(String.valueOf(system));
                String oldprom = prom.getText();
                prom.setText(oldprom + value);

                break;
            case "-":
                String valuekum = input.getText();
                this.snumber = Integer.parseInt(valuekum);
                long systemkum = this.fnumber - this.snumber;
                input.setText(String.valueOf(systemkum));
                String oldpromkum = prom.getText();
                prom.setText(oldpromkum + valuekum);

                break;
            case "x":
                String valuej = input.getText();
                this.snumber = Integer.parseInt(valuej);
                long systemj = this.fnumber * this.snumber;
                input.setText(String.valueOf(systemj));
                String oldpromj = prom.getText();
                prom.setText(oldpromj + valuej);

                break;
            case "/":
                String valued = input.getText();
                this.snumber = Integer.parseInt(valued);
                long systemd = this.fnumber / this.snumber;
                input.setText(String.valueOf(systemd));
                String oldpromd = prom.getText();
                prom.setText(oldpromd + valued);

                break;

        }
    }
}
