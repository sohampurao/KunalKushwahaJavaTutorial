import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Display menu options to the user
        System.out.println("Please make a selection: ");
        System.out.println("1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius\n3. Exit Program");
        System.out.print("Enter selection Number: ");

        // Initialize the Scanner for user input
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        String result;

        // Perform the appropriate action based on user choice
        switch(choice) {
            case 1:
                // Convert Celsius to Fahrenheit
                System.out.print("Enter value in degree Celsius: ");
                double temperatureInCelsius = scanner.nextDouble();
                double fahrenheit = (temperatureInCelsius * 9 / 5) + 32;
                result = "Temperature of " + temperatureInCelsius + "°C in Fahrenheit is " + fahrenheit + "°F.";
                break;
            case 2:
                // Convert Fahrenheit to Celsius
                System.out.print("Enter the value in Fahrenheit: ");
                double temperatureInFahrenheit = scanner.nextDouble();
                double celsius = (temperatureInFahrenheit - 32) * 5 / 9;
                result = "Temperature of " + temperatureInFahrenheit + "°F in Celsius is " + celsius + "°C.";
                break;
            case 3:
                // Exit the program
                result = "Program exited";
                System.out.println(result);
                scanner.close();
                System.exit(0);
                break;
            default:
                // Handle invalid user input
                result = "Please enter a valid selection.";
                break;
        }

        // Display the result of the conversion or the exit message
        System.out.println(result);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
