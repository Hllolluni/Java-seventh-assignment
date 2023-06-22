package com.eutraining.hllolluni.slide26;

public class ThreadOfAnnonymousClass {

    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("Run method from an annonymous class!");
            }
        };
        thread.start();
    }
}
