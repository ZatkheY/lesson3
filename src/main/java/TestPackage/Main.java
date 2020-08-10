package TestPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        testThread.action();
//        ThreadAction threadAction = new ThreadAction(testThread);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(testThread);
        executorService.shutdown();
    }
}
