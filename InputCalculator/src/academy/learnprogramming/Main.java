package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while(scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
            // scanner.nextLine(); // unnecessary here, since we don't need to print an alert for invalid number
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double)sum/count));
        scanner.close();
    }
}
