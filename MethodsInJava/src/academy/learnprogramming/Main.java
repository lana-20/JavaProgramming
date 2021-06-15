package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        calculateScore(gameOver, score, levelCompleted, bonus);

        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 800;
        levelCompleted = 5;
        bonus = 100;

    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
     // It's not okay to just have gameOver set to true to return a value
     // Also have to send a value back even if gameOVer isn't true
     // All the program variations have to be accounted for
     // We've to return smth every time we specify that we're going be returning data

     // How do we change the code to return a -1 if gameOVer was equal to false?
     // There's 2 ways of doing it:
     //     1. We can put an else here and put return -1
     // ...} else {
     //         return -1;
     //     }
     //     2. We can just put return -1. The same deal happens. The return gets executed here.
     //         As soon as the return keyword is hit, as soon as it processes that line,
     //         it doesn't go any further, it immediately goes back t wherever the call code
     //         that was actually called in the first place.
     //     We only get to this (return -1) line if the previous line (if(condition)) hadn't been executed
     //     Java is happy, we've returned smth no matter what the program flow was


        return -1;
    // -1 (negative one) is conventionally used to indicate an error
    // in searching algos, -1 indicates an invalid value or value not found
    }
}
