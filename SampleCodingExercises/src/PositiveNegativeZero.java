// Sample coding exercise:
// Positive, Negative or Zero
//  Write a method called checkNumber with an int parameter number.
//  The method should not return any value, and it needs to print out:
//      "positive" if the parameter number is > 0
//      "negative" if the parameter number is < 0
//      "zero" if the parameter number is equal to zero
//  NOTE1: The checkNumber method needs to be defined as public static
//  NOTE2: Do not add a main method to your solution code.

public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber (5);
        checkNumber (-7);
        checkNumber (0);
    }
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("zero");
//        } else {
//            System.out.println("What number is this?");
        }
    }
}
