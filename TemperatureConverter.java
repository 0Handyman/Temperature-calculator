import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Temperature Converter");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.print("Enter your choice (1 or 2): ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    {
                        System.out.print("Enter temperature in Celsius: ");
                        double celsius = scanner.nextDouble();
                        double fahrenheit = celsiusToFahrenheit(celsius);
                        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                        break;
                    }
                case 2:
                    {
                        System.out.print("Enter temperature in Fahrenheit: ");
                        double fahrenheit = scanner.nextDouble();
                        double celsius = fahrenheitToCelsius(fahrenheit);
                        System.out.println("Temperature in Celsius: " + celsius);
                        break;
                    }
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                    break;
            }
        }
    }
    
    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
