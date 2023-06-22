package com.eutraining.hllolluni.slide33;

public class HandleInterruptedExceptionClass {

    public static void main(String[] args) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) throws InterruptedException {
//        Thread.sleep(2000);
//    }
}
