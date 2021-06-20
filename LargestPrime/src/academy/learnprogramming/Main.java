package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int getLargestPrime(int number) {
        if (number<2) return -1; // o and 1 are not (do not contain) primes
        for (int i=2; i<number; i++) {
            if (number%i==0) {
                number/=i;
                i--;
            }
        }
        return number;
    }
}
