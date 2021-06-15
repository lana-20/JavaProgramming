// Speed Converter

/* 1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour.
 This method needs to return the rounded value of the calculation of type long.
 If the parameter kilometersPerHour is less than 0, the method toMilesPerHours needs to
 return -1 to indicate an invalid value.
 Otherwise, if it's positive, calculate the value of miles per hour, round it and return it.
 For conversion and rounding, check notes.*/

/* Examples of IO:
    toMilesPerHour(1.5); → should return value 1
    toMilesPerHour(10.25); → should return value 6
    toMilesPerHour(-5.6); → should return value -1
    toMilesPerHour(25.42); → should return value 16
    toMilesPerHour(75.114); → should return value 47*/

/* 2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
Then it needs to print a msg in the format "XX km/h = YY mi/h".
XX represents the original value kilometersPerHour.
YY represents the rounded milesPerHour from the kilometersPerHour parameter.
If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".*/

/* Examples of IO:
    printConversion(1.5); → should print the following text into the console - System.out.println("1.5 km/h = 1 mi/h");
    printConversion(10.25); → should print the following text into the console - System.out.println("10.25 km/h = 6 mi/h");
    printConversion(-5.6); → should print the following text into the console - System.out.println("Invalid Value");
    printConversion(1.5); → should print the following text into the console - System.out.println("1.5 km/h = 1 mi/h");
    printConversion(1.5); → should print the following text into the console - System.out.println("1.5 km/h = 1 mi/h");

 */

/*TIP: In the method printConversion, call the method toMilesPerHour instead of duplicating the code.
NOTE: All methods should be defined as public static.
NOTE: 1 mile per hour is 1.609 kilometers per hour.
NOTE: Do not add the main method to te solution code.
*/

/*Use method Math.round to round the number of calculated miles per hour (double).
The method round returns long.*/

public class SpeedConverter {

    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return  -1;
        }

        return Math.round(kilometersPerHour/1.609);
    }
    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
    } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
