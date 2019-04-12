package org.esurovskiy;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

public class InterruptedExample implements Runnable,
        Callable<String> {
    private volatile boolean isInterrupt = false;
    public void run() {
        //....
        if (isInterrupt){

        }
        //...
        if(isInterrupt){

        }
    }

    public void setInterrupt(final boolean interrupt) {
        isInterrupt = interrupt;
    }

    public String call() throws Exception {
//        Executors.newCachedThreadPool()
        return null;
    }
}
