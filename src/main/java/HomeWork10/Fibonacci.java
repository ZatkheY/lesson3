package HomeWork10;

public class Fibonacci {
    public static void main(String[] args) {
        double time = System.currentTimeMillis();
        System.out.println(fibonacci(52));
        System.out.println((System.currentTimeMillis() - time) / 1000 + " секунд = выполнялся поиск числа Фибаначи");
    }
    public static long fibonacci(long index){
        if(index <2){
            return index;
        }
        else {
            return fibonacci(index - 2) + fibonacci(index -1 );
        }
    }
}
