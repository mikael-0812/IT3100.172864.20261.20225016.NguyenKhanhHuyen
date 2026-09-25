
package lab02;

import java.util.Scanner;

public class MonthDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = -1;
        int year = -1;

        while (month == -1) {
            System.out.print("Enter month: ");
            String input = scanner.nextLine().trim();

            month = parseMonth(input);

            if (month == -1) {
                System.out.println("Invalid month. Please enter again.");
            }
        }

        while (year < 0) {
            System.out.print("Enter year: ");
            String input = scanner.nextLine().trim();

            try {
                if (!input.matches("\\d+")) {
                    throw new NumberFormatException();
                }

                year = Integer.parseInt(input);

            } catch (NumberFormatException e) {
                System.out.println("Invalid year. Please enter again.");
                year = -1;
            }
        }

        int days;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;

            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            default:
                days = 31;
        }

        System.out.println("Number of days: " + days);

        scanner.close();
    }

    private static int parseMonth(String input) {
        String value = input.toLowerCase();

        switch (value) {
            case "1":
            case "january":
            case "jan":
            case "jan.":
                return 1;

            case "2":
            case "february":
            case "feb":
            case "feb.":
                return 2;

            case "3":
            case "march":
            case "mar":
            case "mar.":
                return 3;

            case "4":
            case "april":
            case "apr":
            case "apr.":
                return 4;

            case "5":
            case "may":
                return 5;

            case "6":
            case "june":
            case "jun":
            case "jun.":
                return 6;

            case "7":
            case "july":
            case "jul":
            case "jul.":
                return 7;

            case "8":
            case "august":
            case "aug":
            case "aug.":
                return 8;

            case "9":
            case "september":
            case "sep":
            case "sep.":
                return 9;

            case "10":
            case "october":
            case "oct":
            case "oct.":
                return 10;

            case "11":
            case "november":
            case "nov":
            case "nov.":
                return 11;

            case "12":
            case "december":
            case "dec":
            case "dec.":
                return 12;

            default:
                return -1;
        }
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0
                || (year % 4 == 0 && year % 100 != 0);
    }
}