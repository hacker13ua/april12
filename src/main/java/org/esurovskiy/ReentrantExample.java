package org.esurovskiy;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample implements Callable<Void> {
    public volatile int count = 0;
    ReentrantLock lock = new ReentrantLock(true);

    public Void call() throws InterruptedException {
        lock.lock();
        try {

//        Thread.sleep(1);
            count++;
        } finally {

            lock.unlock();
        }
//        System.out.println("PrinterTask work " + count);
//        Thread.sleep(2);
        return null;
    }

    public int getCount() {
        return count;
    }
}
