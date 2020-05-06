package Average;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many numbers you want: ");
        int numbers = Integer.parseInt(reader.readLine());
        System.out.println("Enter numbers: ");
        int sum = 0;
        for (int i = 0; i < numbers; i++) {
            int number = Integer.parseInt(reader.readLine());
            sum = sum + number;
        }
        int average = sum / numbers;
        System.out.println("average value equals = " + average);
    }
}
