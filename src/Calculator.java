import  java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter first number:");
        double firstNumber = reader();    //вводим первое число...
        System.out.println("Enter second number:");
        double secondNumber = reader();  //вводим второе число...
        System.out.println("Enter operation:");
        String operation = reader.readLine(); // ввыодим операция...
        operation(operation, firstNumber, secondNumber); // вызываем метод operation и передаем в него наши числа.
    }

    public static Double reader() throws IOException {  // метод ридер проверяет числа, если вводиться что либо,то выскакивает
        double number = Double.MIN_VALUE;               // предуприждения - "number not correct!!!" до тех пока мы не введем число.
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