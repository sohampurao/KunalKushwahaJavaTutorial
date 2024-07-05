// Q: Write a program that returns the case of the character.
package PracticeQuestions;

import java.util.Scanner;

public class CaseCheck {

    public static void main(String[] args) {
        // Declaring required variable
        char ch;

        // Initializing "Scanner" class to read input from user.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        ch = scanner.next().trim().charAt(0);

        if (ch>='a' && ch<='z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }


}
