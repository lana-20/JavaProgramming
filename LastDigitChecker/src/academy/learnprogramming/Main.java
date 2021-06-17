package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("41, 22, and 71 have the same last digit: " + hasSameLastDigit(41, 22, 71));
        System.out.println("23, 32, and 42 have the same last digit: " + hasSameLastDigit(23, 32, 42));
        System.out.println("9, 99, and 999 have the same last digit: " + hasSameLastDigit(9, 99, 99));

        System.out.println("Number 10 is in the valid range: " + isValid(10));
        System.out.println("Number 468 is in the valid range: " + isValid(468));
        System.out.println("Number 1051 is in the valid range: " + isValid(1051));
    }

    public static boolean hasSameLastDigit(int x, int y, int z){
        if(x<10||x>1000||y<10||y>1000||z<10||z>1000) {
            return false;
        } else {
            return(x%10==y%10||x%10==z%10||y%10==z%10);
        }
    }

    public static boolean isValid(int v) {
        return(v<10||v>1000)?false:true;
    }
}

