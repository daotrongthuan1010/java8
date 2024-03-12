package TimeAPI;

import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;

public class YearMonthExample {

    public static void main(String[] args) {

        // Year Example

        Year currentYear = Year.now();
        System.out.println("currentYear: " + currentYear);

        Year specifyYear = Year.of(2024);
        System.out.println("specifyYear: " + specifyYear);
        System.out.println("isLeap : " + specifyYear.isLeap()); // true

        int dayOfYear = 100;
        LocalDate localDate = currentYear.atDay(dayOfYear);
        System.out.println("localDate: " + localDate);

        // YearMonth Example

        YearMonth currentYearMonth = YearMonth.now();
        System.out.println("currentYearMonth: " + currentYearMonth);

        YearMonth specifyYearMonth = YearMonth.of(2024, 1);
        System.out.println("specifyYearMonth: " + specifyYearMonth);

        int dayOfMonth = 20;
        LocalDate localDate2 = currentYearMonth.atDay(dayOfMonth);
        System.out.println("localDate2: " + localDate2);
        // Year -> YearMonth

        YearMonth ym = currentYear.atMonth(5);
        System.out.println("ym: " + ym);
    }
}
