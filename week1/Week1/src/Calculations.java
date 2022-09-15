import java.util.Scanner;

public class Calculations {
    /*
     * Author: Alejandro Acevedo.
     * Simple calculator program. 
     * All the calculations are done using integers and return integers.
     * input: two integers
     * output: an integer
     */
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int result;

    System.out.println("This program can calculate operations between two integer numbers.");
    System.out.println("Please enter the first number:");
    int num1 = input.nextInt();
    System.out.println("Please enter the second number:");
    int num2 = input.nextInt();
    System.out.println("Please enter the symbol for the operation you want to execute: +, -, *, /");
    String operation = input.next();

    // allows the selection of the operation by the user
    switch (operation) {
        case "+":
            result = add(num1, num2);
            break;
        case "-":
            result = subtract(num1, num2);
            break;
        case "*":
            result = multiply(num1, num2);
            break;
        case "/":
            result = divide(num1, num2);
            break;
        default:
            System.out.println("Invalid type of operation. Use the characters: +, -, *, or /");
            result = 0;
            break;
    }

    // Show the results
    System.out.println("The result is: " + result);

    // closes the connection to the scanner
    input.close();
}

    // addition method
    public static int add(int num1, int num2){
        return num1 + num2;
    }
    
    // subtraction method
    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    // multiplication method
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    // division method (its only integers, decimals will be rounded.)
    public static int divide(int num1, int num2){
        return num1 / num2;
    }
}
