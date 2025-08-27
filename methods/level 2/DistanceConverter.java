public class DistanceConverter {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }
    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }
    
    public static void main(String[] args) {
        System.out.println("10 km = " + convertKmToMiles(10) + " miles");
        System.out.println("5 miles = " + convertMilesToKm(5) + " km");
        System.out.println("3 meters = " + convertMetersToFeet(3) + " feet");
        System.out.println("12 feet = " + convertFeetToMeters(12) + " meters");
        System.out.println("7 yards = " + convertYardsToFeet(7) + " feet");
        System.out.println("15 feet = " + convertFeetToYards(15) + " yards");
        System.out.println("2 meters = " + convertMetersToInches(2) + " inches");
        System.out.println("20 inches = " + convertInchesToMeters(20) + " meters");
        System.out.println("8 inches = " + convertInchesToCentimeters(8) + " cm");
    }
}