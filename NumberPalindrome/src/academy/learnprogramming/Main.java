package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("1551 is a palindrome: " + isPalindrome(-1551));
        System.out.println("707 is a palindrome: " + isPalindrome(707));
        System.out.println("11212 is a palindrome: " + isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int origin = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        return origin == reverse;
    }
}




