
// separate Main.java file for IntelliJ testing
// do not include in online solution code

public class Main extends MegaBytesConverter{
    public static int main(String[] args) {
//        long miles = SpeedConverter.toMilesPerHour(10.5);
//        System.out.println("Miles = " + miles);
//
//        SpeedConverter.printConversion(10.5);

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
           System.out.println("megaBytes = " + getMegaBytes + " MB and " + getRemainderKiloBytes + " KB");
    }
}
