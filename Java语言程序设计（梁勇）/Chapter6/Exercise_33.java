package Chapter6;
public class Exercise_33 {
    public static void main(String[] args) {
        long seconds = System.currentTimeMillis() / 1000;
        long currentSecond = seconds % 60;
        long minutes = seconds / 60;
        long currentMinute = minutes % 60;
        long hours = minutes / 60;
        long currentHour = hours % 24;
        long days = hours / 24 + 1; // 1 is to cover the current day
        int year = 1970;
        while (days >= (isLeapYear(year) ? 366 : 365)) {
            days = days - (isLeapYear(year) ? 366 : 365);
            year++;
        }
        int month = 1;
        while (days >= getNumberOfDaysInMonth(year, month)) {
            days = days - getNumberOfDaysInMonth(year, month);
            month++;
        }
        System.out.println("Current date and time is "
                + getMonthName(month) + " " + days + ", " + year + " "
                + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
    public static String getMonthName(int month) {
        String monthName = null;
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }
        return monthName;
    }
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if (month == 2) return isLeapYear(year) ? 29 : 28;
        return 0;
    }
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
