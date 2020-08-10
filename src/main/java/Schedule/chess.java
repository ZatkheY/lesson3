package Schedule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chess {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter width");
        int width = Integer.parseInt(reader.readLine());
        System.out.println("Enter height");
        int height = Integer.parseInt(reader.readLine());
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i % 2 == 0)
                System.out.print(" ");
        }
    }
}




