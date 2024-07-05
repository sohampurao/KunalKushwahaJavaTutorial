import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Initialize variables for input
        int number1, number2;
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter two numbers below:");

        // Read first number
        System.out.print("Number 1:");
        number1 = scanner.nextInt();

        // Read second number
        System.out.print("Number 2:");
        number2 = scanner.nextInt();

        // Calculate and display the sum of the two numbers
        System.out.println("Sum of your numbers is: " + sum(number1, number2));

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Function to calculate the sum of two numbers
    static int sum(int a, int b) {
        return a + b;
    }
}
