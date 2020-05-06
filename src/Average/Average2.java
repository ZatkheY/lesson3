package Average;

public class Average2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            sum = sum + array[i];
        }
        int average = sum / 100;
        System.out.print(average);
    }
}