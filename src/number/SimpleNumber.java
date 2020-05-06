package number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number");
        int simpleNumber = Integer.parseInt(reader.readLine());
        int count = 0;
        for (int i = 1; i <= simpleNumber; i++) {
            if (simpleNumber % i == 0) {
                count++;
            }
        }
        if (count >= 3) {
            System.out.println("Число сложное");
        } else {
            System.out.println("Число простое");
        }

    }
}
