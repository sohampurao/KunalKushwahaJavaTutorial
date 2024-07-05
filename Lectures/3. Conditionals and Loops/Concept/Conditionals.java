// Salary example to demonstrate if-else and if-else-if statements.

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        // Defining required variables first
        double salary, bonus;

        // Initializing scanner class to take salary input from user.
        Scanner scanner = new Scanner(System.in);

        // Taking salary input from user
        System.out.print("Enter employee's salary: ");
        salary = scanner.nextDouble();

        // Basic If-Else statement
//        if (salary>10000) {
//            bonus= 2000;
//            salary+=bonus;
//        } else {
//            bonus=1000;
//            salary+=bonus;
//        }
//        System.out.printf("Employee's salary with Bonus: +" + bonus + " is: " + "$%,5.3f" + "--- By using simple (if-else) Statement.", salary );

        if (salary > 20000) {
            bonus = 2000;
            salary += bonus;
        } else if (salary > 10000) {
            bonus = 1000;
            salary += bonus;
        } else {
            bonus = 500;
            salary += bonus;
        }
        System.out.printf("Employee's salary with Bonus: +" + bonus + " is: " + "$%,5.3f" + "--- By using (if-else-if) Statement.", salary);
    }
}
