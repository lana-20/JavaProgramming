package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000, 5.0));

        for(int i=0; i<5; i++){
            System.out.println("loop " + i +" hello!");
        }

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with and interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window

        for(int i=2; i<9; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }

        // How would you modify the for loop above to do the same thing as
        // shown but to start from *% and work back to 2%

        for(int i=8; i>=2; i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }

        int count = 0;
        for(int i=10; i<50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count==10){
                    System.out.println("exiting for loop");
                    break;
                }
            }
        }

    }

    // Create a for statement using any range of number
    // Determine if the number is a prime number using isPrime method
    // if it is a prime number, print it out AND increment a count of the
    // number of prime numbers found
    // if that count is 3 exit the for loop
    // hint: use the break; statement to exit
    // A prime number can be divided evenly only by 1 or by itself
    // it has to be a whole number greater than 1

    public static boolean isPrime (int n) {
        if(n==1){
            return false;
        }
        for (int i=2; i<=(long) Math.sqrt(n); i++) { // using square root is more optimal for less machine work
//        for (int i=2; i<=n/2; i++) { // Using n/2 as a shortcut. We're attempting to find numbers that divide into n
            // so this loop is only going to go through and calculate what it needs to do
            // so no number that is greater than n/2 is going to divide into n
            // by dividing it by 2, we are optimizing this to make sure that we're not actually processing numbers
            // we don't need to process when we're checking it
            System.out.println("Looping " + i);
            if(n%i==0){ // Checking whether the remainder between n and i dividing i into n is zero
            // if it's zero, we found another number that divides evenly into the number that was passed and
            // therefore it can't be a prime number
            // the number that evenly divides into the number that's passed cannot be a prime number
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return ((amount*interestRate)/100);
    }
}
