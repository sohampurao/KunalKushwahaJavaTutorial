// Question: Take a Name as an Input and "Hello," + "Name" as an Output

package PracticeQuestions; // Package declaration to organize the class

import java.util.Scanner; // Import the Scanner class for reading input

public class HelloWorld { // Declaration of the HelloWorld class
    public static void main(String[] args) {
        // Try-with-resources to ensure the Scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: "); // Prompt the user to enter their name
            String name = scanner.nextLine(); // Read the user's input and store it in the 'name' variable
            sayHello(name); // Call the sayHello method with the user's name as an argument
        } catch (Exception e) {
            // Handle any exceptions that may occur and print an error message
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    // Define the sayHello method which takes a String parameter 'name'
    static void sayHello(String name) {
        // Print a greeting message including the user's name
        System.out.println("Hello, " + name);
    }
}
