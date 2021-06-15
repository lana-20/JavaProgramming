package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2.0));

        int count = 0;
        int sum = 0;
        for (int i=1; i<=1000; i++){
            if (i%3==0 && i%5==0) {
                count++;
                sum+=i;
                System.out.println("Number is " + i);
            }
            if (count==5) {
                break;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
