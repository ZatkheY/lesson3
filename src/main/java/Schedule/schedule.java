package Schedule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class schedule {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter width");
        int first = Integer.parseInt(reader.readLine());
        System.out.println("Enter height");
        int second = Integer.parseInt(reader.readLine());
        for (int i = 0; i < first; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < second; i++) {
            System.out.print("*");
            for (int j = 0; j < first - 2; j++) {

                System.out.print(" ");
                if (j == first - 3) {
                    System.out.println("*");
                }
            }
        }
        for (int i = 0; i < first; i++) {
            System.out.print("*");
        }
    }
}
