import java.util.Scanner;
import java.lang.Math;

public class Calculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        String operator;
        
        System.out.println("Enter the first number:");
        num1 = scanner.nextDouble();
        
        System.out.println("Enter the second number:");
        num2 = scanner.nextDouble();
        
        System.out.println("Enter the operator (+, -, *, /, sqrt, pow, sin, cos, tan):");
        operator = scanner.next();
        
        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;
            case "sqrt":
                result = Math.sqrt(num1);
                System.out.println("Square root of " + num1 + " is " + result);
                result = Math.sqrt(num2);
                System.out.println("Square root of " + num2 + " is " + result);
                break;
            case "pow":
                result = Math.pow(num1, num2);
                System.out.println(num1 + " raised to the power of " + num2 + " is " + result);
                break;
            case "sin":
                result = Math.sin(num1);
                System.out.println("Sine of " + num1 + " is " + result);
                result = Math.sin(num2);
                System.out.println("Sine of " + num2 + " is " + result);
                break;
            case "cos":
                result = Math.cos(num1);
                System.out.println("Cosine of " + num1 + " is " + result);
                result = Math.cos(num2);
                System.out.println("Cosine of " + num2 + " is " + result);
                break;
            case "tan":
                result = Math.tan(num1);
                System.out.println("Tangent of " + num1 + " is " + result);
                result = Math.tan(num2);
                System.out.println("Tangent of " + num2 + " is " + result);
                break;
            default:
                System.out.println("Invalid operator entered.");
                break;
        }
        
        scanner.close();
        
    }

}
