#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.Scanner;

public class Calculator {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter operand 1: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Enter operand 2: ");
        double operand2 = scanner.nextDouble();

        scanner.close();


        System.out.println("Addition: " + add(operand1, operand2));
        System.out.println("Subtraction: " + subtract(operand1, operand2));
        System.out.println("Multiplication: " + multiply(operand1, operand2));
        System.out.println("Division: " + divide(operand1, operand2));
    }

}
