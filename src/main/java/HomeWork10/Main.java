package HomeWork10;


public class Main {
    public static void main(String[] args) {
        double time = System.currentTimeMillis();
        fibonacci(52);
        System.out.println();
        System.out.println((System.currentTimeMillis() - time) / 1000 + " секунд = выполнялся поиск числа Фибаначи");
    }

    public static void fibonacci(int index) {
        long firstNumber = 0;
        long secondNumber = 1;
        long result = 0;
        for (int i = 1; i < index; i++) {
            result = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = result;
        }
        System.out.print(result);
    }
}
