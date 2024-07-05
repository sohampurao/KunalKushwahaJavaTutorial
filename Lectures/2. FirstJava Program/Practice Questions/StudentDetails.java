import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            // Declaring variables for storing student details
            String firstName, lastName, fullName;
            int rollNumber;
            double percentage;

            // Prompting the user to enter their first name
            System.out.print("Enter your First Name: ");
            firstName = scanner.next();

            // Prompting the user to enter their last name
            System.out.print("Enter your Last Name: ");
            lastName = scanner.next();

            // Concatenating first and last name to get the full name
            fullName = firstName + " " + lastName;

            // Prompting the user to enter their roll number
            System.out.print("Enter your Roll Number: ");
            rollNumber = scanner.nextInt();

            // Prompting the user to enter their percentage
            System.out.print("Enter your Percentage: ");
            percentage = scanner.nextDouble();

            scanner.close();
            // Displaying the entered student details
            System.out.println("Student Name: " + fullName);
            System.out.println("Student Roll Number: " + rollNumber);
            System.out.println("Student has scored: " + percentage + "%");
    }
}
