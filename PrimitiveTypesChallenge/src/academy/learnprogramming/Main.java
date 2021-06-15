package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte anyValidByte = 112;
        short anyValidShort = 11235;
        int anyValidInt = 1_123_581_321;
        long anyValidLong = 50000L + 10L * (anyValidByte + anyValidShort + anyValidInt);
        System.out.println(anyValidLong);

        short shortTotal = (short) (1000 + 10 *(anyValidByte + anyValidShort + anyValidInt));
    }
}
