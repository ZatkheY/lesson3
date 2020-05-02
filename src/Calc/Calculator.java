package Calc;

import  java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter first number:");
        double firstNumber = reader();
        System.out.println("Enter second number:");
        double secondNumber = reader();
        System.out.println("Enter operation:");
        String operation = reader.readLine();
        operation(operation, firstNumber, secondNumber);
    }

    public static Double reader() throws IOException {
        double number = Double.MIN_VALUE;
        boolean istrue = true;
        while (istrue) {
            try {
                number = Double.parseDouble(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("number not correct!!!");
            }
            istrue = number == Double.MIN_VALUE;
        }
        return number;
    }

    public static void operation(String operation, double firstNumber, double secondNumber) {
        double result = 0;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                System.out.println("result = " + result);
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.println("result = " + result);
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.println("result = " + result);
                break;
            case "/":
                result = firstNumber / secondNumber;
                System.out.println("result = " + result);
                break;
            default:
                System.out.println("operation not correct");
        }
    }
}