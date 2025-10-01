import java.util.Scanner;
import java.util.InputMismatchException;

class Calculator {
    int addition(int a, int b) {
        return a + b;
    }

    int subtraction(int a, int b) {
        return a - b;
    }

    int multiplication(int a, int b) {
        return a * b;
    }

    double division(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Calculator calc = new Calculator();

        try {
            System.out.println("Enter two numbers: ");
            int a = inp.nextInt();
            int b = inp.nextInt();

            System.out.println("Addition: " + calc.addition(a, b));
            System.out.println("Subtraction: " + calc.subtraction(a, b));
            System.out.println("Multiplication: " + calc.multiplication(a, b));
            System.out.println("Division: " + calc.division(a, b));

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers only.");
        } finally {
            System.out.println("Calculator program terminated. Thank you!");
            inp.close();
        }
    }
}