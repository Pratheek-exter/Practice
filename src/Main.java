public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero.");
        }
    }

    public static int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        int num1 = 1000000000;
        int num2 = 500000000;

        int sum = add(num1, num2);
        int difference = subtract(num1, num2);
        int product = multiply(num1, num2);
        double quotient = divide(num1, num2);
        int result = power(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Result of " + num1 + " raised to the power of " + num2 + ": " + result);
    }
}
