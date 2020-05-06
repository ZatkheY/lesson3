package Average;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number");
        double firstNumber = Integer.parseInt(reader.readLine());
        System.out.println("Enter second number");
        double secondNumber = Integer.parseInt(reader.readLine());
        double average = (firstNumber + secondNumber) / 2;
        System.out.println(average);

    }
}
