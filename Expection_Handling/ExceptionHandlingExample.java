import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get input from user
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } finally {
            // This block is always executed
            System.out.println("Program has completed execution.");
            scanner.close();
        }
    }
}
