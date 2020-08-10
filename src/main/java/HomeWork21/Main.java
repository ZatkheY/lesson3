package HomeWork21;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Cycles cycles = new Cycles();
//        ThreadCycles threadCycles = new ThreadCycles(cycles);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(cycles);
        executorService.shutdown();
    }
}
