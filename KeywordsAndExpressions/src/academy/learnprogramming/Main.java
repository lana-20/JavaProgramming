package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // a mile is equal tp 1.609344 km
        double kilometers = (100 * 1.609344);
        int highScore = 50;
        if(highScore == 50) {
            System.out.println("This is an expression");
        }

        // In the following code, what parts of the code are expressions?
        int score = 100;
        if (score >99) {
            System.out.println("You got the high score!");
            score = 0;
        }
        // Expressions are:
        // score = 100, score > 99, "You got the high score!", score = 0.
    }
}
