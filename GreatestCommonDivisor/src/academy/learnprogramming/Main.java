package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("GCD for 25 and 15 is " + getGreatestCommonDivisor(25, 15));
        System.out.println("GCD for 12 and 30 is " + getGreatestCommonDivisor(12, 30));
        System.out.println("GCD for 9 and 18 is " + getGreatestCommonDivisor(9, 18));
        System.out.println("GCD for 81 and 153 is " + getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int gcd;

        while (first%second>0){
            gcd=first%second;
            first=second;
            second=gcd;
        }
//        while (first != second) {
//            if (first > second)
//                first = first - second;
//            else {
//                second = second - first;
//            }
//        }
        return second;
    }
}



