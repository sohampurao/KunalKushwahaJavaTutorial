package PracticeQuestions;

import java.util.Scanner;

public class FrequencyOfNumber {
    public static void main(String[] args) {
        // Initializing Scanner class to take input from user
        Scanner scanner = new Scanner(System.in);

        // Taking the parent number from which we have to find the frequency of 'n'
        System.out.print("Enter the parent number: ");
        int number = scanner.nextInt();

        // Taking the digit whose frequency we need to find in the parent number
        System.out.print("Enter the digit whose frequency you have to find: ");
        int n = scanner.nextInt();

        // Passing the number and n term to frequencyCount() method
        int frequency = frequencyCount(number, n);
        System.out.printf("The frequency of %d in %d is: %d%n", n, number, frequency);

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    /**
     * Method to count the frequency of a digit in a given number.
     *
     * @param number the parent number in which to find the frequency of the digit
     * @param n the digit whose frequency is to be found
     * @return the frequency of the digit 'n' in the given number
     */
    static int frequencyCount(int number, int n) {
        int count = 0;
        while (number > 0) {
            int remainder = number % 10; // Get the last digit of the number
            if (remainder == n) {
                count++; // Increment count if the digit matches 'n'
            }
            number /= 10; // Remove the last digit from the number
        }
        return count;
    }
}