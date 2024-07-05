package PracticeQuestions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Initializing Scanner class to take input from user
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an operator (+, -, /, %, x to exit): ");
            char operator = scanner.next().trim().charAt(0);

            // Check for valid operators or exit command
            if (operator == '+' || operator == '-' || operator == '/' || operator == '%' || operator == '*') {
                // Declare variable to store the answer
                int answer = 0;

                // Take two numbers as input from the user
                System.out.print("Enter first number: ");
                int number1 = scanner.nextInt();

                System.out.print("Enter second number: ");
                int number2 = scanner.nextInt();

                // Perform the operation based on the operator
                switch (operator) {
                    case '+':
                        answer = number1 + number2;
                        break;
                    case '-':
                        answer = number1 - number2;
                        break;
                    case '/':
                        // Check for division by zero
                        if (number2 != 0) {
                            answer = number1 / number2;
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                            continue; // Skip the rest of the loop and prompt for input again
                        }
                        break;
                    case '%':
                        // Check for division by zero
                        if (number2 != 0) {
                            answer = number1 % number2;
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                            continue; // Skip the rest of the loop and prompt for input again
                        }
                        break;
                    case '*':
                        answer = number1 * number2;
                        break;
                }

                // Print the result of the operation
                System.out.println("Answer: " + number1 + " " + operator + " " + number2 + " = " + answer);

            } else if (operator == 'x' || operator == 'X') {
                // Exit the program if 'x' or 'X' is entered
                System.out.println("Exiting the program...");
                break;
            } else {
                // Handle invalid operators
                System.out.println("Invalid Operator!! Please enter a valid operator.");
            }
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
