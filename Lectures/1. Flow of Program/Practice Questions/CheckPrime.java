package PracticeQuestions; // Package declaration to organize the class

import java.util.Scanner; // Import the Scanner class for reading input

public class CheckPrime { // Declaration of the CheckPrime class
    public static void main(String[] args) {
        // Try-with-resources to ensure the Scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a Number: "); // Prompt the user to enter a number
            int number = scanner.nextInt(); // Read the user's input and store it in the 'number' variable
            int count = 2; // Initialize count to 2, the first potential divisor

            // Check if the number is less than or equal to 1
            if (number <= 1) {
                System.out.println("The number is neither Prime nor Composite."); // Print appropriate message
            } else {
                // Loop to check for factors up to the square root of the number
                while (count * count <= number) {
                    // Check if 'number' is divisible by 'count'
                    if (number % count == 0) {
                        System.out.println("The " + number + " is not a prime number."); // Print that number is not prime
                        System.exit(-1); // Exit the program indicating the number is not prime
                    }
                    count++; // Increment count to check the next potential divisor
                }
                // If no divisors were found, the number is prime
                System.out.println("The " + number + " is a prime number."); // Print that number is prime
            }
        } catch (Exception e) {
            // Handle any exceptions that may occur and print an error message
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
