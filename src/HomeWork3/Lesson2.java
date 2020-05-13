package HomeWork3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson2 {
    public static void main(String[] args)throws IOException {
        reader();
    }

    public static void reader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter coordinate x , y upper left corner:");
        int xLeft = Integer.parseInt(reader.readLine());
        int yLeft = Integer.parseInt(reader.readLine());
        System.out.println("Enter coordinate x , y bottom right corner:");
        int xRight = Integer.parseInt(reader.readLine());
        int yRight = Integer.parseInt(reader.readLine());
        System.out.println("enter x , y  point coordinates:");
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        check(xLeft,yLeft,xRight,yRight,x,y);
    }

    public static void check(int xLeft, int yLeft, int xRight, int yRight, int x, int y) {
        if (x >= xLeft && x <= xRight || x <= xLeft && x >= xRight || y >= yLeft && y <= yRight || y <= yLeft && y >= yRight) {
            System.out.println("point belongs!!!");
        } else {
            System.out.println("point does not belong!!!");
        }
    }
}
