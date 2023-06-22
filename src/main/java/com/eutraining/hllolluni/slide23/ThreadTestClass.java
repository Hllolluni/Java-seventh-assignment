package com.eutraining.hllolluni.slide23;

public class ThreadTestClass {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadImplementingRunnableClass());
        thread.start();
    }
}
