package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of digits in number 32123 is " + sumDigits(32123));
    }

    private static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125/10=12 -> 12*10=120 ->125-120=5  -  the way to ge the least significant digit (LSD)

        while (number > 0) {
            // extract the LSD
            int digit = number % 10;
            sum += digit;

            // drop the LSD
            number/=10;    // same as number=number/10;
        }
        return sum;
    }
}

/*
-Write a method with the name sumDigits that has one int param called number.
-If param is >=10 then teh method should process the number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
-The numbers from 0-9 have 1 digit so we don't want to process them, also we don't want to process
negative numbers, so also return -1 for negative numbers.
-For example, calling method sumDigits(125) should return 8 since 1+2+5=8.
-Add some code to the main method to rest out the sumDigits method to determine that it's
working correctly for valid and invalid values passed as args.
-HINT:
-Use n%10 to extract the least-significant digit.
-Use n/10 to discard the least-significant digit.
-Tje method needs to be static.
*/
