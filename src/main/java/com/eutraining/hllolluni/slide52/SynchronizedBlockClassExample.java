package com.eutraining.hllolluni.slide52;

import com.eutraining.hllolluni.slide43.StaticSynchronizedMethodTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SynchronizedBlockClassExample {

    public static int value = 1;

    public static void execute() {
        synchronized (SynchronizedBlockClassExample.class) {
            value += 1;
            System.out.println(value);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);

        IntStream.range(1, 100)
                .forEach(count ->
                        service.submit(SynchronizedBlockClassExample::execute));

        if (!service.awaitTermination(200, TimeUnit.MILLISECONDS)) {
            service.shutdown();
        }
    }
}
