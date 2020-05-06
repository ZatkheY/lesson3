package number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        int number = Integer.parseInt(reader.readLine());
        int count = 0;
        for (int i = 1; i < 1_000_000; i++) {
            if (i % number == 0) {
                System.out.print(i + " ");
                count++;
                if (count == 10)
                    break;
            }
        }
    }
}
