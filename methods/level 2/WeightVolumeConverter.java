public class WeightVolumeConverter {
    
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    public static void main(String[] args) {
        System.out.println("50 pounds = " + convertPoundsToKilograms(50) + " kilograms");
        System.out.println("20 kilograms = " + convertKilogramsToPounds(20) + " pounds");
        System.out.println("10 gallons = " + convertGallonsToLiters(10) + " liters");
        System.out.println("25 liters = " + convertLitersToGallons(25) + " gallons");
    }
}