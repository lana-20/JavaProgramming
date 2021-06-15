/*
1. Create a method called getDurationString with two params,
1st param minutes and 2nd param seconds.
You should validate that the 1st param minutes is >= 0.
You should validate that the 2nd param seconds is >= 0 and <= 59.
The method should return "Invalid value" in the method if either of the above are not true.
If the the params are valid, the calculate how many hrs, mins and secs equal the mins and secs
passed to this method and return that value as string in format "XXh YYm ZZs" where XX
represents a number of hrs, YY the mins and ZZ the secs.

2. Create a second method of the same name but with only one param seconds.
Validate that it is >= 0, and return "Invalid value" if it's not true.
If it's valid, then calculate how many mins are in the secs value and then call the other
overloaded method passing the correct mins and secs calculated so that is can
calculate correctly.

Tips:
- Use int or long for your number data types
- 1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds
- Methods should be static as we have used previously.

Bonus:
 - For the input 61 minutes output should be 01h 01m 00s, but it's ok if it's 1h 1m 0s
    (Tip: use if-else to diplay the leading zero)*/

package academy.learnprogramming;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
        System.out.println(getDurationString(0));
    }

    private static String getDurationString(int minutes, int seconds) {
        if ((minutes<0) || (seconds<0) || (seconds>59)) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes/60;
        int remainMinutes = minutes%60;

        String hoursString = hours + "h ";
        if (hours<10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = remainMinutes + "m ";
        if (remainMinutes<10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds<10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + minutesString + secondsString;
    }

    private static String getDurationString(int seconds) {
        if (seconds<0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds/60;
        int remainSeconds = seconds%60;
        return getDurationString(minutes, remainSeconds);
    }
}