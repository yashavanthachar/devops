import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Add the two numbers
        double sum = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + sum);
    }
}
