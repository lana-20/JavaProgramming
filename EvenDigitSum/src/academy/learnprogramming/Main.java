package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of even digits in 123456789 is " + getEvenDigitSum(123456789));
        System.out.println("The sum of even digits in 252 is " + getEvenDigitSum(252));
        System.out.println("The sum of even digits in -22 is " + getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number<0) return -1;
        int sum = 0;
        while (number!=0) {
            sum+=(number%2==0)?(number%10):0;
            number/=10;
        }
        return sum;
    }
}

