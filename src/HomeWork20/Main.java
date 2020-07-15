package HomeWork20;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = new int[10];
        for (int i = 0; i < 10; i++) {
            list[i] = ((int) (1 + Math.random() * 11));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        searchIndex(list, number);
    }

    private static void searchIndex(int[] list, int number) {
        Arrays.sort(list);
        int firstIndex = 0;
        int lastIndex = list.length - 1;
        while (firstIndex < lastIndex) {
            int sum = list[firstIndex] + list[lastIndex];
            if (sum == number) {
                System.out.println(Arrays.toString(list));
                System.out.print("[" + firstIndex + "]" + " " + "[" + lastIndex + "]");
                return;
            } else {
                if (sum < number) {
                    firstIndex++;
                } else {
                    lastIndex--;
                }
            }
        }
    }
}