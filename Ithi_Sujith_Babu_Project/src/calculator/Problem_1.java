package calculator;

import java.util.Scanner;

public class Problem_1 {

    double calculate(double a, double b, String operation) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return b != 0 ? a / b : Double.NaN;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem_1 calc = new Problem_1();

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        String operation = sc.next();

        double result = calc.calculate(a, b, operation);
        System.out.println("Result: " + result);

        sc.close();
    }
}
