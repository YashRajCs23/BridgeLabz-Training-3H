public class TemperatureConverter {
    
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
    public static void main(String[] args) {
        System.out.println("100 Fahrenheit = " + convertFahrenheitToCelsius(100) + " Celsius");
        System.out.println("0 Celsius = " + convertCelsiusToFahrenheit(0) + " Fahrenheit");
    }
}