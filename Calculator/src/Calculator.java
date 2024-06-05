import java.util.Scanner;

public class Calculator {

    public void calculate() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the first number (or type 'exit' to quit):");
            if (scanner.hasNext("exit")) {
                break;
            }
            double numberOne = scanner.nextDouble();

            System.out.println("Enter the operator (+, -, *, /, inv, sqrt, sq):");
            String operator = scanner.next();

            double numberTwo = 0;
            if (!operator.equals("inv") && !operator.equals("sqrt") && !operator.equals("sq")) {
                System.out.println("Enter the second number:");
                numberTwo = scanner.nextDouble();
            }

            double result = 0;

            switch (operator) {
                case "+":
                    result = numberOne + numberTwo;
                    break;
                case "-":
                    result = numberOne - numberTwo;
                    break;
                case "*":
                    result = numberOne * numberTwo;
                    break;
                case "/":
                    if (numberTwo != 0) {
                        result = numberOne / numberTwo;
                    } else {
                        System.out.println("Error! Division by zero.");
                        continue;
                    }
                    break;
                case "inv":
                    result = 1 / numberOne;
                    break;
                case "sqrt":
                    if (numberOne >= 0) {
                        result = Math.sqrt(numberOne);
                    } else {
                        System.out.println("Error! Cannot take the square root of a negative number.");
                        continue;
                    }
                    break;
                case "sq":
                    result = numberOne * numberOne;
                    break;
                default:
                    System.out.println("Unknown operator");
                    continue;
            }

            System.out.println("Result is: " + result);

            System.out.println("Do you want to continue? (y/n)");
            String continueOption = scanner.next();
            if (!continueOption.equalsIgnoreCase("y")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Calculator closed.");
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.calculate();
    }
}
