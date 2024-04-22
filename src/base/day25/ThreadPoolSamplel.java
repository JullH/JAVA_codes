package src.base.day25;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @version 1.0
 * @auther JullH
 */

public class ThreadPoolSamplel {
    public static void main(String[] args) {
       ExecutorService threadPool = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + finalI);
                }
            });
        }
        threadPool.shutdown();
    }
}
