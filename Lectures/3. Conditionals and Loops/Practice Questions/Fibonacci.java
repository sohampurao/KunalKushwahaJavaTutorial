package PracticeQuestions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Initialize the scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a N number to find its Fibonacci value: ");
        int term = scanner.nextInt();

        // Calculate and display the Fibonacci value for the given term
        System.out.println("The value of the term " + term + " in the Fibonacci series is: " + calcFibonacciValue(term));

        // Calculate and print fibonacci series til nth term given by user.
        printFibonacci(term);
        // Close the scanner to avoid resource leak
        scanner.close();
    }

    /**
     * Method to calculate the nth Fibonacci number.
     *
     * @param n the term in the Fibonacci series to find
     * @return the nth Fibonacci number
     */
    static int calcFibonacciValue(int n) {
        if (n <= 0) {
            // Return 0 for non-positive input
            return 0;
        } else if (n == 1) {
            // Return 1 for the first term
            return 1;
        } else {
            int prev = 0, current = 1, fib = 0;
            // Loop to calculate the nth Fibonacci number iteratively
            for (int i = 2; i <= n; i++) {
                fib = prev + current; // Current Fibonacci number is the sum of the previous two
                prev = current; // Update previous to the current
                current = fib; // Update current to the new Fibonacci number
            }
            return fib; // Return the nth Fibonacci number
        }
    }

    /**
     * Method to calculate and print fibonacci series to nth term.
     *
     * @param n term to calculate fibonacci series.
     *
     */
    static void printFibonacci(int n) {
        int prev=0, current=1, fibonacciNumber=0;
        if (n <= 0) {
            // Return 0 for non-positive input
            System.out.println("0");
        } else if (n == 1) {
            // Return 1 for the first term
            System.out.println("1");
        } else {
            for (int i=2; i<=n; i++){
                fibonacciNumber= prev + current;
                prev=current;
                current=fibonacciNumber;
                System.out.print(fibonacciNumber + " ");
            }
        }
    }
}
