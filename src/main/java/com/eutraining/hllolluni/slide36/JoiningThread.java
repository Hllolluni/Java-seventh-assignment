package com.eutraining.hllolluni.slide36;

import java.util.Random;

public class JoiningThread implements Runnable{
    private Random random = new Random(System.currentTimeMillis());

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            random.nextInt();
        }
        System.out.println(Thread.currentThread().getName() + " finnished!");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread [] threads = new Thread[3];
        for (int i = 0; i < threads.length; i++){
            threads[i] = new Thread(new JoiningThread(), "joinThread - "+i);
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        System.out.println("After all threads finnished their execution!");
    }
}
