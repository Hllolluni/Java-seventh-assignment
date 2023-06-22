package com.eutraining.hllolluni.slide38;

public class UserAndDaemonThreadTestClass {
    public static void main(String[] args) throws InterruptedException {
        Thread userThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("UserThread");
            }
        });
        Thread daemonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("DaemonThread");
            }
        });
        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();

        //without daemonThread.join() declaration the daemonThread would not finish its execution
        daemonThread.join();
    }
}
