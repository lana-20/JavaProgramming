package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean isPerfectNumber(int number) {
        int sumOfProperDivisors = 0;
        for (int i = 1; i < number; i++)
            if (number % i == 0)
                sumOfProperDivisors += i;
        return sumOfProperDivisors == number && number > 1;
    }
}
