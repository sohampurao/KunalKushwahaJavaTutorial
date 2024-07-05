// Illustrating working of loops with examples
// Q: Printing numbers up to the number that user has given.

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // Declaring required variable
        int number, i=1;

        // Creating instance of scanner class to take input from user.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a number: ");
        number = scanner.nextInt();

        // Illustrating same with for loop.
//        for(i=1; i<=number; i++ ) {
//            System.out.print(i + " ");
//        }

        // Illustrating same with while loop.
//        while (i<=number) {
//            System.out.print(i+" ");
//            i++;
//        }

        // Illustrating same with do-while loop.
        do {
            System.out.println(i);
            i++;
        } while(i<=number);
    }
}