import java.time.Month;
import java.time.Year;
import java.time.YearMonth;

/**
 * Created by admin on 4/12/17.
 */
public enum Months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

    public int getDays(int year) {
        System.out.println(this.name());

        switch (this.name()) {
            case "JANUARY":
            case "MARCH":
            case "MAY":
            case "JULY":
            case "AUGUST":
            case "OCTOBER":
            case "DECEMBER":
                return 31;
            case "FEBRUARY":
                if (year % 4 == 0){
                   return 29;
            } else {
                return 28;}
            case "APRIL":
            case "JUNE":
            case "SEPTEMBER":
            case "NOVEMBER":
                return 30;

        }

        return year;


    }
}







