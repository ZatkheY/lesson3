package HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson1 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        char[]arr = reader.readLine().toCharArray();
        int result= 0;
        for (char c : arr) {
            result = result + Character.getNumericValue(c);
        }
        System.out.println(result);
    }
}
