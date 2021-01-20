package test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test2 {
    public static void main(String[] args) {
        Calendar t2 = new GregorianCalendar(2016, 9, 26);
        Calendar t1 = new GregorianCalendar(2013, 8, 13);
        System.out.println(getDifference(t2, t1));
    }

    private static String getDifference(Calendar t1, Calendar t2) {
        StringBuilder result = new StringBuilder("> ");
        result.append(t1.get(Calendar.YEAR) > t2.get(Calendar.YEAR) ? t1.get(Calendar.YEAR) - t2.get(Calendar.YEAR)
                : t2.get(Calendar.YEAR) - t1.get(Calendar.YEAR));
        result.append(":");
        result.append(t1.get(Calendar.MONTH) > t2.get(Calendar.MONTH) ? t1.get(Calendar.MONTH) - t2.get(Calendar.MONTH)
                : t2.get(Calendar.MONTH) - t1.get(Calendar.MONTH));
        result.append(":");
        result.append(t1.get(Calendar.DATE) > t2.get(Calendar.DATE) ? t1.get(Calendar.DATE) - t2.get(Calendar.DATE)
                : t2.get(Calendar.DATE) - t1.get(Calendar.DATE));
        return result.append(" < ").toString();
    }
}
