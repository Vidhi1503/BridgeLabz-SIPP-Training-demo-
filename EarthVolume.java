public class EarthVolume {
    public static void main(String[] args) {
        double rad = 6378;
        double volkm = (4.0/3) * Math.PI * Math.pow(rad, 3);
        double volmi = volkm / Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volkm + " and cubic miles is " + volmi);
    }
}