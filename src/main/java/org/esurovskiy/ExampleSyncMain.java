package org.esurovskiy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExampleSyncMain {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService =
                Executors.newFixedThreadPool(100);

        final ReentrantExample printerTask = new ReentrantExample();
        for (int i = 0; i < 100_000; i++) {
            executorService.submit(printerTask);
        }
        Thread.sleep(2000);
        System.out.println(printerTask.getCount());
    }
}
