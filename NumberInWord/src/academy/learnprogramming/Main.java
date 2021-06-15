package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
          getDaysInMonth(1, 2020);
//        printNumberInWord(0);
//        printNumberInWord(1);
//        printNumberInWord(2);
//        printNumberInWord(3);
//        printNumberInWord(4);
//        printNumberInWord(5);
//        printNumberInWord(6);
//        printNumberInWord(7);
//        printNumberInWord(8);
//        printNumberInWord(9);
//        printNumberInWord(10);
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        switch(month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year)? 29 : 28;
            default:
                return 31;
        }
    }
}