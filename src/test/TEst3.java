package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TEst3 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate firstDate = LocalDate.parse("01.01.2020", formatter);
        LocalDate secondDate = LocalDate.parse("01.01.2021", formatter);
        double month = ChronoUnit.MONTHS.between(firstDate, secondDate);
        double year = ChronoUnit.MONTHS.between(firstDate, secondDate);;


        long dayOfLeaving = ChronoUnit.DAYS.between(firstDate, secondDate);
//        double dayLeaving = dayOfLeaving / 9d;

//        BigDecimal dayLeavingBig = new BigDecimal(dayLeaving);
        System.out.println((28 * month) / 12);
    }
}
