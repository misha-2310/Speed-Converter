public class Main {
    public static void main(String[] args) {
        double miles = SpeedConverter.toMilesPerHour(75.114);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(75.114);
    }
}
