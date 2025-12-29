import java.util.Scanner;

public class BadCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a = sc.nextDouble();

        System.out.println("Enter second number:");
        double b = sc.nextDouble();

        System.out.println("Enter operator (+, -, *, /):");
        String op = sc.next();

        double result = 0;

        if (op.equals("+")) {
            result = a + b;
            System.out.println("Result is: " + result);
        }

        if (op.equals("-")) {
            result = a - b;
            System.out.println("Result is: " + result);
        }

        if (op.equals("*")) {
            result = a * b;
            System.out.println("Result is: " + result);
        }

        if (op.equals("/")) {
            if (b != 0) {
                result = a / b;
                System.out.println("Result is: " + result);
            } else {
                System.out.println("Cannot divide by zero");
            }
        }

        sc.close();
    }
}