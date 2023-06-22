package com.eutraining.hllolluni.slide42;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SynchronizedMethodTest {

    int value = 1;

    public synchronized void execute() {
        value += 2;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        SynchronizedMethodTest methodTest = new SynchronizedMethodTest();

        IntStream.range(1,100)
                .forEach(count -> service.submit(() -> methodTest.execute()));

        if (!service.awaitTermination(200, TimeUnit.MILLISECONDS)) {
            service.shutdown();
        }

        System.out.println(methodTest.value);
    }
}
