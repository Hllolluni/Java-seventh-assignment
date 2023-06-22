package com.eutraining.hllolluni.slide28;

public class ThreadTest {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside run method of inner runnable!");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
