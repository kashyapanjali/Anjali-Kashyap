//A calculator class that performs basic arithmetic operations (Addition, Subtraction, Multiplication, Division)

import java.util.*;

public class Problem1 {

     //calculator class
      static class Calculator {
        double a, b;
        String operation;

        // Constructor
        public Calculator(double a, double b, String operation) {
            this.a = a;
            this.b = b;
            this.operation = operation.toLowerCase();
        }

        public double calculate() {
            switch (operation) {
                case "+": return a + b;
                case "-": return a - b;
                case "*": return a * b;
                case "/": return b != 0 ? a / b : Double.NaN;
                default: throw new IllegalArgumentException("Invalid operation");
            }
        }  
    }

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter a second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation like (+, -, *, /): ");
        String op = sc.next();

        Calculator c = new Calculator(a,b, op);
        System.out.println("Result: " + c.calculate());

        sc.close();
    }
}
