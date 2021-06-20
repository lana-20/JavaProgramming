package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2021.125"; // "2021a" or "2021.125a" will throw a format exception, can't convert "a" to int/double
        System.out.println("numberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        // For int use: int number = Integer.parseInt(numberAsString);
        // Integer. or Double. is a wrapper class for a primitive type int/double
        // parseInt or parseDouble is static method we can use to convert or to parse a string type into a number
        System.out.println("numberAsInteger = " + number);

        numberAsString +=1;
        number +=1;

        System.out.println("numberAsString = " + numberAsString); // output: 20211 - number is concatenated to string
        System.out.println("numberAsInteger = " + number); // output: 2022

    }
}
