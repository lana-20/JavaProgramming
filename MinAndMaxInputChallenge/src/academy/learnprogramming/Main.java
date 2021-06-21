package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE; // 2147483647
        int max = Integer.MIN_VALUE; // -2147483648
        // if you put "max" value as (2,147,483,647) any positive number the user enters will be less than max
        // eg., (100 > 2,147,483,647), so the condition will never be true
        // that's why we switch the min and max value
        // if we compare (100 > -2,147,483,648) it will be true, so the new max value will be 100, and vice verse

//        boolean first = true; // boolean flag - we set this boolean to true, while we wait for the user to enter an initial number

        while (true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {

                int number = scanner.nextInt();

//                if (first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine(); // handle input (enter key)
        }
        System.out.println("min = " + min + ", max = " + max);
        scanner.close();
    }
}

// Read the numbers from the console entered by the user and print the min and max number the user has entered.
// Before the user enters the number, print the message "Enter number:"
// If the user enter an invalid number, break out of the loop and print the min and mac number.
// Hint: Use an endless while loop.

