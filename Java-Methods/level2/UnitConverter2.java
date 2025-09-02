public class UnitConverter2 {
    public static double convertYardsToFeet(double yards) { return yards * 3; }
    public static double convertFeetToYards(double ft) { return ft * 0.333333; }
    public static double convertMetersToInches(double m) { return m * 39.3701; }
    public static double convertInchesToMeters(double in) { return in * 0.0254; }
    public static double convertInchesToCm(double in) { return in * 2.54; }

    public static void main(String[] args) {
        System.out.println("2 yards = " + convertYardsToFeet(2) + " feet");
        System.out.println("12 inches = " + convertInchesToCm(12) + " cm");
    }
}
