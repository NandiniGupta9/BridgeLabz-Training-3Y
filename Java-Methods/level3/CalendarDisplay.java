import java.util.*;

public class CalendarDisplay {
    public static void main(String[] args) {
        int month = 8;  // August
        int year = 2025;

        displayCalendar(month, year);
    }

    static void displayCalendar(int month, int year) {
        Calendar cal = new GregorianCalendar(year, month - 1, 1);
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        int startDay = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println("Calendar for " + month + "/" + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 1; i < startDay; i++) System.out.print("    ");

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay - 1) % 7 == 0) System.out.println();
        }
    }
}
