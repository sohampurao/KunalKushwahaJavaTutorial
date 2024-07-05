// Question: Take input of a salary. If the salary is greater 
// than 10,000 add bonus as 2000, otherwise ass bonus as 1000.
package PracticeQuestions; // Package declaration to organize the class

import java.util.Scanner; // Import the Scanner class for reading input

public class SalaryBonus { // Declaration of the SalaryBonus class
    public static void main(String[] args) {
        // Try-with-resources to ensure the Scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the salary of the employee: "); // Prompt the user to enter the salary
            int salary = scanner.nextInt(); // Read the user's input and store it in the 'salary' variable

            // Check if the salary is greater than 10,000
            if (salary > 10000) {
                salary += 2000; // If true, add a bonus of 2000 to the salary
            } else {
                salary += 1000; // If false, add a bonus of 1000 to the salary
            }

            // Print the updated salary with the bonus included
            System.out.println("Employee's salary with Bonus is: " + salary);
        } catch (Exception e) {
            // Handle any exceptions that may occur and print an error message
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
