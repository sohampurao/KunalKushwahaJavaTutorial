package PracticeQuestions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Initializing Scanner class to take input from user
        Scanner scanner = new Scanner(System.in);

        // Taking a number to reverse
        System.out.print("Enter a number which you have to reverse: ");
        int number = scanner.nextInt();

        // Passing number to reverseNumber() function
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    /**
     * Method to reverse the given number.
     *
     * @param number the number to be reversed
     * @return the reversed number
     */
    static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            int remainder = number % 10;  // Get the last digit of the number
            reversedNumber = reversedNumber * 10 + remainder;  // Append the last digit
            number /= 10;  // Remove the last digit from the number
        }
        return reversedNumber;
    }
}
