package org.esurovskiy;


import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DateTaskMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService executorService =
                Executors.newScheduledThreadPool(4);
        System.out.println("Thread pool created");
        final DateTask dateTask = new DateTask();
        System.out.println("Task created " + new Date());

        executorService.scheduleAtFixedRate(dateTask, 2,
                1, TimeUnit.SECONDS);

        while (true) {
            System.out.println("Get from getter " + dateTask.getDate());
        }

//        executorService.shutdown();
    }
}
