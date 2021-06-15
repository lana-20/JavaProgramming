package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printDayOfTheDay(-1);
        printDayOfTheDay(0);
        printDayOfTheDay(1);
        printDayOfTheDay(2);
        printDayOfTheDay(3);
        printDayOfTheDay(4);
        printDayOfTheDay(5);
        printDayOfTheDay(6);
        printDayOfTheDay(7);
    }

    private static void printDayOfTheDay(int day) {
//        switch (day) {
//            case 0:
//                System.out.println("Sunday");
//                break;
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("Invalid day");
//                break;
//        }

        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}