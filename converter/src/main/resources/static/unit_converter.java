import java.util.Scanner;

public class unit_converter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Simple Measurement Form ===");

        // LENGTH
        System.out.print("Enter length (in meters): ");
        double length = input.nextDouble();

        // WEIGHT
        System.out.print("Enter weight (in kg): ");
        double weight = input.nextDouble();

        // TEMPERATURE
        System.out.print("Enter temperature (in Celsius): ");
        double temperature = input.nextDouble();

        System.out.println("\n=== SUMMARY ===");
        System.out.println("Length: " + length + " m");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Temperature: " + temperature + " °C");

        input.close();
    }
}