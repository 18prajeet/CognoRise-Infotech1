import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter any of the keys to perform the respective operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int operation = sc.nextInt();

        if (operation == 1) {
            // Addition
            System.out.println("Enter the two numbers for Addition:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a + b;
            System.out.println("Result: " + c);
        } else if (operation == 2) {
            // Subtraction
            System.out.println("Enter the two numbers for Subtraction:");
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = c - d;
            System.out.println("Result: " + e);
        } else if (operation == 3) {
            // Multiplication
            System.out.println("Enter the two numbers for Multiplication:");
            int f = sc.nextInt();
            int g = sc.nextInt();
            int h = f * g;
            System.out.println("Result: " + h);
        } else if (operation == 4) {
            // Division with exception handling
            System.out.println("Enter the two numbers for Division:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            try {
                float result = (float) a / b;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operation. Please select a valid option.");
        }

        sc.close();
    }
}
