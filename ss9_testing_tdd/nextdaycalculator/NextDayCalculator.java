package ss9_testing_tdd.nextdaycalculator;

public class NextDayCalculator {
    public static String getNextDay(int day, int month, int year) {
        if (day == 31 && month == 12) {
            return "1/1/" + (year + 1);
        } else if (day == 30 || day == 31 ||
                  (day == 28 && month == 2 && year % 4 != 0) ||
                  (day == 29 && month == 2)) {
            return "1/" + (month + 1) + "/" + year;
        } else {
            return (day + 1) + "/" + month + "/" + year;
        }
    }
}
