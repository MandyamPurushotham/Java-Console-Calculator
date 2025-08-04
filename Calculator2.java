import java.util.Scanner;

public class Calculator2 {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=== Basic Calculator ===");

        while (keepRunning) {
            // Get user input
            System.out.print("\nEnter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;
            boolean validOperator = true;

            // Perform operation
            switch (operator) {
                case '+' -> result = add(num1, num2);
                case '-' -> result = subtract(num1, num2);
                case '*' -> result = multiply(num1, num2);
                case '/' -> result = divide(num1, num2);
                default -> {
                    System.out.println("Invalid operator.");
                    validOperator = false;
                }
            }

            if (validOperator) {
                System.out.println("Result: " + result);
            }

            // Ask to continue or exit
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("yes")) {
                keepRunning = false;
                System.out.println("Exiting calculator. Goodbye!");
            }
        }

        sc.close();
    }
}
