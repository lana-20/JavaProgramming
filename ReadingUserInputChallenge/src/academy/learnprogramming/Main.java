package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
//        while (true) {
        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter ++;
                sum += number;
//                if (counter == 10) {
//                    break;
//                }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end line (enter key)
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}

// Read 10 numbers from the console entered by the user and print the sum of those numbers.
// Create a Scanner.
// Use the hasNExtInt() method from the scanner to check if the user has entered an int value.
// If hasNextInt() returns false, print the message "Invalid Number". Continue reading until you have read 10 numbers.
// Before the user enters each number, print the message "Enter number #x:" where x represents the count, i.e. 1,2,3,4, etc.
// Eg., the 1st message printed to the user should be "Enter number #1:", the next "Enter number #2:" and so on.
// Hint:
//      - Use a while loop
//      - Use a counter variable for counting valid numbers
//      - Close the scanner after you don't need it any more
