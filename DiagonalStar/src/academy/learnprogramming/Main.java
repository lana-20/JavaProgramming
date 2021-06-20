package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

    }

    public static void printSquareStar(int number) {
        if (number < 5) System.out.println("Invalid Value");
        else {
            for (int row = 0; row < number; row++) {
                for (int column = 0; column < number; column++) {
                    if (row == 0 || row == number - 1 || column == 0 || column == number - 1 || column == row || column == number - 1 - row)
                        System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }

// Below captioned is the refactored code explaining how the * is displayed, using numbers 1-5 for clearer representation of the output
//    public static void printSquareStar (int number) {
//        if (number < 5) System.out.println("Invalid Value");
//        else {
//            for (int row = 0; row < number; row++) {
//                for (int column = 0; column < number; column++) {
//                    if (row==0 || row==number) System.out.print("1"); // top and bottom rows
//                    else if (column==0) System.out.print("2"); // left column
//                    else if (column==number-1) System.out.print("3"); // right column
//                    else if (column==row) System.out.print("4"); // diagonal down to right
//                    else if (column==number-1-row) System.out.println("5"); //diagonal down to left
//                    // alternative to lines 29-33 // if (row==0 || row=number-1 || column==0 || column==number-1 || column==row || column==number-1-row) System.out.print("*");
//                    else System.out.print(" "); // empty space between numbers
//                }
//            }
//            System.out.println(""); // puts a return to the row
//        }
//    }
}

