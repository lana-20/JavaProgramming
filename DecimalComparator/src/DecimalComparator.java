// The integer variables x and y are first taking the given numbers and multiplying by 1000.
// This moves the first three decimal places to the right of the decimal,
// and then the (int) casts that result into an integer.
// Once casted, the resulting integers have the first three decimal places present.
// Them, we subtract those two integers from each other.
// If the original three decimal places (now an integer are the same, the result is zero.
// If zero, the return value is true. Else, the return value is false.

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double x, double y) {
        if ((int)(x * 1000) == (int)(y * 1000)) {
            return true;
        } return false;
    }
}
