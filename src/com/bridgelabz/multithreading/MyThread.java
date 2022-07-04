package com.bridgelabz.multithreading;

// Runnable , Callable
public class MyThread implements Runnable {


    @Override
    public void run() {
        System.out.println("Run method");
        for (int i=0;i<=50;i++){
            System.out.println("run => "+i);
        }
    }
}
