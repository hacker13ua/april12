package org.esurovskiy;

import java.util.Date;
import java.util.concurrent.Callable;

public class DateTask implements Runnable {
    volatile private Date date;
    public void run() {
        date = new Date();
        System.out.println("Start get date" + new Date());
    }

    public Date getDate() {
        return date;
    }
}
