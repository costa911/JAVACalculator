import java.util.Scanner;

public class Calculator {

    public void calculate() {
        // Create a scanner instance to read data from console
        Scanner scanner = new Scanner(System.in);

        // Run the calculator in a while loop for multiple calculations
        while (true) {
            // Get the 3 inputs required for calculation from user and store in variables
            System.out.println("Enter the first number (or type 'exit' to quit):");
            if (scanner.hasNext("exit")) {
                break;
            }
            double numberOne = scanner.nextDouble();

            System.out.println("Enter the operator (+, -, *, /):");
            String operator = scanner.next();

            System.out.println("Enter the second number:");
            double numberTwo = scanner.nextDouble();

            // Create a variable to store result
            double result = 0;

            // Use the if/else-if structure to check what the operator is.
            if (operator.equals("+")) {
                result = numberOne + numberTwo;
            } else if (operator.equals("-")) {
                result = numberOne - numberTwo;
            } else if (operator.equals("/")) {
                if (numberTwo != 0) {
                    result = numberOne / numberTwo;
                } else {
                    System.out.println("Error! Division by zero.");
                    continue;
                }
            } else if (operator.equals("*")) {
                result = numberOne * numberTwo;
            } else {
                System.out.println("Unknown operator");
                continue;
            }

            // Print the result on console screen
            System.out.println("Result is: " + result);
        }

        scanner.close();
        System.out.println("Calculator closed.");
    }

    // Every executable class must contain a 'main'
    public static void main(String[] args) {
        // Create a new instance of class Calculator
        Calculator cal = new Calculator();
        // Call the function 'calculate'
        cal.calculate();
    }
}
