package com.eutraining.hllolluni.slide14;

public class MainThread {
    public static void main(String[] args) {
        long mainThreadId = Thread.currentThread().getId();
        String mainThreadName = Thread.currentThread().getName();
        int mainThreadPriority = Thread.currentThread().getPriority();
        Thread.State state = Thread.currentThread().getState();
        String threadGroup = Thread.currentThread().getThreadGroup().getName();
        System.out.println("id = "+ mainThreadId + "\n" + "name = "+mainThreadName + "\n" + "priority = "+mainThreadPriority);
        System.out.println("state = " + state + "\n" + "threadGroup = " + threadGroup);
    }
}
