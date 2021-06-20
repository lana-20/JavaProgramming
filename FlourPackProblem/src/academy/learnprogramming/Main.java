package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) { // 1. Validation
        if(bigCount<0 || smallCount<0 || goal <0) {
            return false;
        }
        if(bigCount*5 + smallCount < goal) { // 2. Supply must be grater than demand
            return false;
        }
        return (goal%5 <=smallCount); // 3. Regardless of bigCount, remainder of the goal must be <= smallCount
    }

/*
The solution can be shortened by combining all the validations with the return statement, as follows,
but at the expense of readability:

    public static boolean canPack(int bigCount, int smallCount, int goal) {
    return ((bigCount>=0 && smallCount>=0 && goal>0) && (goal<=bigCount*5 + smallCount) && (smallCount>=goal%5));
    }
 */
}
