package number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class even {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number");
        int number = Integer.parseInt(reader.readLine());
        if (number % 2 == 0) {
            System.out.printf("The number %d is even ", number);
        } else {
            System.out.printf("The number %d is odd ", number);
        }
    }
}
