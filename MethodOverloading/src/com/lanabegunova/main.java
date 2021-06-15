package com.lanabegunova;

public class main {
    public static void main(String[] args) {
        calculateScore("Lana", 500);
        int newScore = calculateScore("Lana", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        double cm = calcFeetAndInchesToCentimeters(6, 0);
        if (cm<0.0) {
            System.out.println("Invalid params");
        }

        calcFeetAndInchesToCentimeters(157);
/*
Create a method called calcFeetAndInchesToCentimeters
Int needs to have two parameters.
feet is the 1st param, inches is the 2nd param

You should validate that the first param feet is >= 0
You should validate that the 2nd param inches is >=0 && <=12
return -1 from the method if either of the above is not true

If the params are valid, then calculate how many centimeters
comprise the feet and inches passed to this method and return that value.

Create a 2nd method of the same name but only with one param.
inches is the param
validate that its >=0
return -1 if it not true
But if it's valid then calculate how many feet are in the inches
and then here's the tricky part:
Call the other overloaded method passing the correct feet and inches
calculates so that it can calculate correctly.
Hints: Use double for your number data types is probably a good idea
1 inch = 2.54cm and 1 foot = 12 inches
use this link https://www.metric-conversions.org/length/feet-to-centimeters.htm
to confirm your code is calculating correctly.
Calling another overloaded method just requires you to use the
right number of params.
*/
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static int calcFeetAndInchesToCentimeters(double ft, double in) {
        if ((ft<0) || (in<0) || (in>12)) {
            System.out.println("Invalid ft or in params");
            return -1;
        }
        double cm = ft*12*2.54;
        cm += in*2.54;
        System.out.println(ft + " ft, " + in + " in = " + cm + " cm");
        return (int)cm;
    }

    public static int calcFeetAndInchesToCentimeters(double in) {
        if (in<0) {
            return -1;
        }
        double ft = (int)in/12;
        double remainIn = (int)ft%12;
        System.out.println(in + " in = " + ft + " ft and " + remainIn + " in");
        return calcFeetAndInchesToCentimeters(ft, remainIn);
    }
}