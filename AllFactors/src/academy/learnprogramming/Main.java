package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        System.out.println("The factor(s) of 6 is(are) " + printFactors(6));
//        System.out.println("GCD for 12 and 30 is " + getGreatestCommonDivisor(12, 30));
//        System.out.println("GCD for 9 and 18 is " + getGreatestCommonDivisor(9, 18));
//        System.out.println("GCD for 81 and 153 is " + getGreatestCommonDivisor(81, 153));
    }

    public static void printFactors(int number) {
        if (number < 0) System.out.println("Invalid Value");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) System.out.println(i);
        }
    }
}