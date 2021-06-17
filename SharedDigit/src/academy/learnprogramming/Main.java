package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("12 and 23 have a shared digit: " + hasSharedDigit(12, 23));
        System.out.println("9 and 99 have a shared digit: " + hasSharedDigit(9, 99));
        System.out.println("15 and 55 have a shared digit: " + hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int x, int y) {
        if ((x<10) || (x>99) || (y<10) || (y>99)) {
            return false;
        } else {
            return ((x%10==y%10) || (x/10==y/10) || (x%10==y/10) || (y%10==x/10));
        }
    }
}
/*
above solution only works for 2-digit numbers
 x/10 = first digit of x
 y/10 = first digit of y
 when we divide a number by 10, it removes the last digit and we are left with only the 1st digit
 eg. 45/10=4
 x%10 = last digit of x
 y%10 = last digit of y
 when we take the modulo of a number using 10, it extracts the last digit
 eg. 68%10=8
 when put all together, we get
 eg. x=23, y=13
     return ((3==3) || (2==1) || (3==1) || (3==2));
*/
