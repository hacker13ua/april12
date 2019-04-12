package org.esurovskiy;

import java.util.concurrent.Callable;

public class PrinterTask implements Callable<Void> {
    public volatile int count = 0;

    public synchronized Void call() throws InterruptedException {
        synchronized (this) {
            Thread.sleep(1);

            count++;
        }
//        System.out.println("PrinterTask work " + count);
//        Thread.sleep(2);
        return null;
    }

    public int getCount() {
        return count;
    }
}
