import java.util.Date;

public class DateParser {

    // method to parse dates in "YYYY-MM-DD" form
    public static Date parseDate(String date) {
        // Basic format check
        if (date == null || date.length() != 10 || date.charAt(4) != '-' || date.charAt(7) != '-') {
            System.out.println("invalid format: " + date);
            return null;
        }

        try {
            // parse the numbers from the String
            int year = Integer.parseInt(date.substring(0,4));
            int month = Integer.parseInt(date.substring(5,7));
            int day = Integer.parseInt(date.substring(8,10));

            // ensure month is a valid month
            if(month < 1 || month > 12) {
                System.out.println("invalid month: " + month);
                return null;
            }

            // store the number days in a month
            int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            // ensure day is a valid day for that month
            if (day < 1 || day > daysInMonth[month - 1]) {
                System.out.println("invalid day: " + day + " for month " + month);
                return null;
            }

            // the offset confuses me...
            return new Date(year - 1900, month - 1, day);

        } catch (NumberFormatException e) {
            System.out.println("invalid number format in date: " + date);
            return null;
        }
    }

    // checking against all the rules for leap years
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        System.out.println(parseDate("2023-10-15"));
    }
}
