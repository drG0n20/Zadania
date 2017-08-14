package Algorithms;


public class DzienRoku extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Dzień roku";
    }

    int[] _daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // dni w roku
    int[] _daysInMonthLeapYear = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //dni w roku przestepnym


    @Override
    public void runAlgorithm(String[] input) {

        int day = Integer.parseInt(input[1]);
        int month = Integer.parseInt(input[2]);
        int year = Integer.parseInt(input[3]);
        int[] daysInMonth;

        if (!IsLeapYear(year)) //jezeli rok jest przestepny
        {
            daysInMonth = _daysInMonth;
        } else // jezeli rok przestepny
        {
            daysInMonth = _daysInMonthLeapYear;
        }

        if (month > 12) {
            System.out.println("Nie ma takiej daty!");
            return;
        }

        if (day > daysInMonth[month]) {
            System.out.println("Nie ma takiej daty!");
            return;
        }

        int result = 0;

        for (int i = 0; i < month; i++) {
            result = daysInMonth[i] + result;
        }
        result = result + day;
        System.out.printf("Dzień %d.%d.%d jest %d dniem roku", day, month, year, result);
    }

    private Boolean IsLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}
